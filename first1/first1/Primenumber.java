package day1.first1;

public class Primenumber {
 public void prim(){
	 for (int num=1;num<=15;num++)
	 {
		 boolean cond=false;
		 for (int i=2;i<=num-1;i++)
		 	 {
		 		if(num%i==0) 
		 			{
		 				cond=true;
		 			}
		 	 }
		 		if(cond==false) 
		 		{
		 		System.out.println(num+"is a prime number");
		 		
		 		}
		 		else
		 		{
		 			System.out.println(num+"is not a prime number");	
		 		}
		 }
		 		
}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber PN = new Primenumber();
		PN.prim();
	}

}
