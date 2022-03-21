
public class Skin {
	private Health[][] k1 = new Health[23][23];
	private Health[][] k2 = new Health [23][23];
private boolean swap = true; //показывает, какой из массивов действующий
	
	Health [][] k1() {
		return this.k1;
	}
	
	Health [][] k2() {
		return this.k2;
	}
	
	public Skin() { 
		for(int i = 0; i < 23; i++) {
			k1[i][0] = new Immun(i, 0);
			k1[i][22] = new Immun(i, 22);
			k1[0][i] = new Immun(0, i);
			k1[22][i] = new Immun(22, i);
			k2[i][0] = new Immun(i, 0);
			k2[i][22] = new Immun(i, 22);
			k2[0][i] = new Immun(0, i);
			k2[22][i] = new Immun(22, i);
		}
		
		for(int i = 1; i < 22; i ++) 
			for(int j = 1; j < 22; j++) {
				k1[i][j] = new Health(i, j);
				k2[i][j] = new Health(i, j);
			}
		k1[11][11] = new Zaraja(11, 11);
		k2[11][11] = new Zaraja(11, 11);
		
	}
	//возврат текущей клетки 
	public Health comeback(int x, int y) { 
		if(swap)
			return k1[x][y];
		else
			return k2[x][y];
	}
	// Замена клетки
	public void Sub(Health h, int x, int y) { 
		if(swap) {
			k2[x][y] = h;
			k1[x][y].dont_need();
		}
		else {
			k1[x][y] = h;
			k2[x][y].dont_need();
		}
		
	}
	//печать клетки 
	public void print() { 
		if (swap)
			for(int i = 1; i < 22; i ++) {
				for(int j = 1; j < 22; j++) {
					k1[i][j].print();
					}
				System.out.println();
				}
		else
			for(int i = 1; i < 22; i ++) {
				for(int j = 1; j < 22; j++) {
					k2[i][j].print();
					}
				System.out.println();
				}
	}
    // смена состояние кожи
	public void next () { 
		
		for(int i = 1; i < 22; i++)
			for(int j = 1; j < 22; j++) {
				if (swap && k1[i][j].vary_need()) {
				    k2[i][j] = k1[i][j].changes(this);
				}
				else if (!swap && k2[i][j].vary_need()) { 
					k1[i][j] = k2[i][j].changes(this);
				}
				k2[i][j].need();
				k1[i][j].need();
			}
		
		swap = !swap;
	}
}

 