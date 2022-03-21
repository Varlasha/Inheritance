
public class Immun extends Health{
	public Immun(int x, int y)
	{super(x, y);}
	
	protected int time=4;
	// может ли эта клетка  заразиться 
	public boolean zaraja_now() 
	{
		return false;
	}
	//печать иммунной  клетки 
		public void print()
	{
		System.out.print(" i ");
	}
   //возврат следующего состояния  
	public Health changes(Skin skin)
	{
		if (time == 0) {
		return new Health (x,y);
		}
		time-- ;
		return this;
	}
}
