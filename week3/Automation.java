package week3;

public class Automation extends MultipleLanguage implements language, testtool  {

	public static void main(String[] args) 
	{
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.seleni();
		auto.java();

	}

	@Override
	public void java() 
	{
		System.out.println("We are using first language as java");
		
	}
	
	@Override
	public void python() {
		System.out.println("second language is python");
	}
	
	@Override
	public void ruby() {
		System.out.println("And the other language is ruby");
	}


	public void seleni() {
		// TODO Auto-generated method stub
		System.out.println("Tool is selenium");
	}



	

}
