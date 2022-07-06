package class_objects;

public class Rectangle {
int length,breadth;
public Rectangle(int l,int b) {
	length=l;
	breadth=b;
}
public int Area() {
	return length*breadth;
}

	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		System.out.println(r1.Area()+" and "+ r2.Area());
		
	}

}
