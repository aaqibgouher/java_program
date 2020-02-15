class Area{
	static int my_static = 1;
	int area(int n){
		return n*n;
	}

	int area(int a, int b){
		return a*b;
	}
}
class Main{
	public static void main(String args[]){
		Area area1 = new Area();
		Area area2 = new Area();
		System.out.println("area of square "+area1.area(2));
		System.out.println("area of rectangle "+area1.area(2, 3));
		System.out.println("static 1 = "+Area.my_static);
		System.out.println("static 1 = "+area1.my_static);
		System.out.println("static 2 = "+area2.my_static);
		area2.my_static = 2;
		System.out.println("static 1 = "+area1.my_static);
		System.out.println("static 2 = "+area2.my_static);
	}
}