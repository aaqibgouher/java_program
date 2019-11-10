class Area{
	int length,breadth;

	int findArea(){
		return this.length * this.breadth;
	}
}

class Rectangle extends Area{
	Rectangle(int x,int y){
		this.length = x;
		this.breadth = y;
	}
}

class Square extends Area{
	Square(int a){
		this.length = a;
		this.breadth = this.length;
	}
}

class Circle extends Area{
	Circle(int r){
		this.length = r;
		this.breadth = r;
	}
}

class Main{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(2,5);
		System.out.println("Area of Rectangle is "+rect.findArea());
		Square sqr = new Square(9);
		System.out.println("Area of sqaure is "+sqr.findArea());
		Circle cir = new Circle(4);
		double p = 3.124 * (cir.findArea());
		System.out.println("Area of circle is "+p);
	}
}