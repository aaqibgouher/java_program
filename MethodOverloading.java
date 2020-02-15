class Area{
	int area(int n){
		return n*n;
	}

	int area(int a, int b){
		return a*b;
	}
}
class Main{
	public static void main(String args[]){
		Area area = new Area();
		System.out.println("area of square "+area.area(2));
		System.out.println("area of rectangle "+area.area(2, 3));
	}
}