class Area{
	int length, breadth;

	int area(){
		return this.length * this.breadth;
	}
}
class Rectangle extends Area{
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
}
class Square extends Rectangle{
	Square(int length){
		super(length, length);
	}
}
class Main{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(2, 3);
		System.out.println("area of rectangle : "+rect.area());

		Square square = new Square(2);
		System.out.println("area of square : "+square.area());
	}
}