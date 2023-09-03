package week3;

public class Student extends Department {
public void studentname() {
	System.out.println("Vignesh");
}
public void studentdep() {
	System.out.println("CSE");
}
public void studentid() {
	System.out.println("Student id is 004 ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student sdt = new Student();
sdt.collegename();
sdt.collegecode();
sdt.collegerank();
sdt.departmentname();
sdt.studentname();
sdt.studentid();
sdt.studentdep();
	}

}
