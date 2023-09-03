package week3;

public class Desktop extends Computer {

	public void desktopsize()
	{
		System.out.println("It is a 15 inch laptop");
	}
	
	public static void main(String[] args) 
	{
		Desktop Des = new Desktop();
		Des.desktopsize();
		Des.computermodel();

	}

}
