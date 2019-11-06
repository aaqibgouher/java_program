class New{
	int length,breadth;

	New(int x,int y){
		this.length = x;
		this.breadth = y;
	}

	New(int a){
		this.length = this.breadth = a;
	}

	int findArea(){
		return length * breadth;
	}
}

class Main{
	public static void main(String args[]){
		New rect = new New(2,5);
		New rect1 = new New(4);
		System.out.println("Area is "+rect.findArea());
		System.out.println("Area is "+rect1.findArea());
	}
}