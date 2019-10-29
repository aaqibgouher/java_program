class Rectangle{
	int length, width;

	void getData(int length, int width){
		this.length = length;
		this.width = width;
	}

	int findArea(){
		return this.length*this.width;
	}
}

class Main{
	public static void main(String args[]){
		Rectangle rect = new Rectangle();
		rect.getData(2,3);
		int area = rect.findArea();
		System.out.println("area is "+area);
	}
}