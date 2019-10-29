class Rectangle{
	int length, width;

	// this is constructor
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	int findArea(){
		return this.length*this.width;
	}

	int findPerimeter(){
		return 2*(this.length + this.width);
	}
}

class Main{
	public static void main(String args[]){
		Rectangle rect = new Rectangle(2,3);
		int area = rect.findArea();
		int perimeter = rect.findPerimeter();
		System.out.println("length = "+rect.length+" width = "+rect.width);
		System.out.println("area is "+area);
		System.out.println("perimeter is "+perimeter);
	}
}