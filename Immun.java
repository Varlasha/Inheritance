
public class Immun extends Health{
	public Immun(int x, int y)
	{super(x, y);}
	
	protected int time=4;
	public boolean zaraja_now() 
	{
		return false;
	} 
		public void print()
	{
		System.out.print(" i ");
	}
	public Health changes(Skin skin)
	{
		if (time == 0) {
		return new Health (x,y);
		}
		time-- ;
		return this;
	}
}
