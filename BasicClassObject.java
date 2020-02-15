class Rectangle{
	int length, width;

	int findArea(int l, int b){
		return l*b;
	}
}

class Main{
	public static void main(String args[]){
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		// Rectangle rect2 = rect1;
		int area1 = rect1.findArea(2,3);
		int area2 = rect2.findArea(4,3);
		System.out.println("Area 1 is "+area1);
		System.out.println("Area 2 is "+area2);
	}
}