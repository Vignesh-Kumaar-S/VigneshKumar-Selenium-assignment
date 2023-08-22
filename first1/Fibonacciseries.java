package day1.first1;

public class Fibonacciseries {

	public void fibo() {
		
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println(num1);
		for (int J=0;J<=56;J++) 
		{
			sum = num1+num2;
			System.out.println(sum);
			num1=num2; 
			num2=sum;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacciseries FB = new Fibonacciseries();
		FB.fibo();
	}

}
