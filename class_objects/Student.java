package class_objects;

public class Student {
	String name;
	int roll_no;
}
class objects{
	public static void main(String[] args) {
	Student s=new Student();
	s.name="John";
	s.roll_no=2;
	System.out.println("The name and roll no of the student is "+ s.name + " and "+ s.roll_no);
	}
}
