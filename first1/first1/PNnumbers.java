package day1.first1;

public class PNnumbers {
	public void positiveNegative(){
		int a = 0;
		if(a<0) 
		{
			System.out.println("The given number is negative number");
		    int b=a+2*(-1*a);
		    System.out.println("The number " +a+ " is converted to positive number = " +b);
		}
		else if(a>0)
		{
			System.out.println("The given number " +a+" is a positive number");
		}
		else 
		{
			System.out.println("The given number " +a+" is neither positive nor negative");
		}
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PNnumbers PN = new PNnumbers(); 
		PN.positiveNegative();
	}

	}
