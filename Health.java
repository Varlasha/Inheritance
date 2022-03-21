
public class Health {
	protected int x, y;
	protected boolean vary= true;
	public Health(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	//клетка изменяется 
	public void need() {
		vary = true;
	}
	//клетка не  изменяется 
	public void dont_need() {
		vary = false;
	}
	
	public boolean vary_need() {
		return vary;
	}
	//печать здоровой клетки 
	public void print() 
	{
		System.out.print(" h ");
	}
	// может ли эта клетка  заразиться
	public boolean zaraja_now()
	{
		return true;
	}
	//возврат следующего состояния 
	public Health changes(Skin skin){
		return this;
	}

}

