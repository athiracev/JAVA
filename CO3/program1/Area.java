/* Area of different shapes using overloaded functions  */

class Shape{
	double x;
	Shape(double m){
		x=m;
	}
}

class Rectangle extends Shape{
	double y;
	Rectangle(double m,double n){
		super(m);
		y=n;
	}
	void area(double x,double y){
		System.out.println("Area of rectangle:"+(x*y));
	}
}

class Square extends Shape{
	Square(double m){
		super(m);
	}
	void area(double x){
		System.out.println("Area of square:"+(x*x));
	}
}

class Circle extends Shape{
	Circle(double m){
		super(m);
	}
	void area(){
		System.out.println("Area of circle:"+(3.14*super.x*super.x));
	}
}

class Area{
	public static void main(String args[]){
		
		Rectangle r=new Rectangle(8,6);
		Square s=new Square(4);
		Circle c=new Circle(3);
		r.area(r.x,r.y);
		s.area(s.x);
		c.area();
	}
}
