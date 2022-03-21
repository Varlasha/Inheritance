import java.util.Random;

public class Zaraja extends Immun{
	public Zaraja(int x, int y)
	{super(x, y);}
	protected int time=6;
	// может ли эта клетка  заразитьс€
	public boolean zaraja_now(Health h) 
	{
		Random r = new Random();
	if (h.zaraja_now()) {
		if (r.nextInt() % 2 == 0)
			return true;
	}
	return false;	
	}
	//печатать заражЄнной клетку
	public void print() 
	{
		System.out.print(" z ");
	}
	//¬озврат состо€ни€ клетки 
	public Health changes(Skin skin)
	{
		Random r = new Random();
		if (time == 0) {
			return new Immun(x,y);
		} 
		time--;
	// заражение 
	int str = Math.abs(r.nextInt());
	int stl = Math.abs(r.nextInt()) ;
	for (int i = -1; i <= 1; i++) {
		for (int j = -1; j <= 1; j ++) {
			if (this.zaraja_now(skin.comeback(x + str % 3- 1, y + stl % 3 - 1))) {
				skin.Sub(new Zaraja(x + str % 3 - 1, y + stl % 3 - 1), x + str % 3 - 1, y + stl % 3 - 1);
				return this;
			}
			stl++;
		}
		str++;
	}
	return this;
}		
}
