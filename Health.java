
public class Health {
	protected int x, y;
	protected boolean vary= true;
	public Health(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void need() {
		vary = true;
	}
	public void dont_need() {
		vary = false;
	}
	
	public boolean vary_need() {
		return vary;
	}
	public void print() 
	{
		System.out.print(" h ");
	}
	public boolean zaraja_now()
	{
		return true;
	}
	public Health changes(Skin skin){
		return this;
	}

}

