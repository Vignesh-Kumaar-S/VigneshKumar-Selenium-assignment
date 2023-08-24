package day1.first1;

public class Vehicle {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2344;
	boolean isPunctured = false;
	String bikeName = "Apache";
	double runningKM = 28956;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle twoWeeler = new Vehicle();
    System.out.println("The bike name is - " +twoWeeler.bikeName);
    System.out.println("Now of wheels in the bike - " +twoWeeler.noOfWheels);
    System.out.println("Now of mirrors in the bike - " +twoWeeler.noOfMirrors);
    System.out.println("Chassis number is - " +twoWeeler.chassisNumber);
    System.out.println("is the bike punctured - " +twoWeeler.isPunctured);
    System.out.println("The total KM run - " +twoWeeler.runningKM);
	}

}
