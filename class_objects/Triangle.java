package class_objects;

public class Triangle {
	int a=3,b=4,c=5;
	public int getperimeter(){
		int s=a+b+c;
		return s;
	}
	public double getarea() {
		double area=0.5*b*c;
		return area;
		
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		System.out.println("area= "+t.getarea());		
		
		System.out.println("The perimeter of the triangle is= "+t.getperimeter());
		
	}

}
