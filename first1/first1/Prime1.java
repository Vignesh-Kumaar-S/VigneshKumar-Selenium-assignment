package day1.first1;

public class Prime1 {
 
	public void pm(){
		//int num=29,a = 0;
		for (int num=2;num<=15;num++)
		if(num%num==0)		
		 {
			if(num==2||num==3)
			{
				System.out.println(num+"is a prime number");
			}
			else
			{
				if(num%2==0||num%3==0) 
				{
				System.out.println(num+"is not a prime number");	
			    }
				else
				{
					System.out.println(num+"is a prime number");
				}
			    }
		 }
	}
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Prime1 PNumber = new Prime1();
			PNumber.pm();
		}}

	
	


