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
		New rect1 = new New(5,10);
		New rect2 = new New(2);
		
		System.out.println("Area is "+rect1.findArea());
		System.out.println("Area is "+rect2.findArea());
	}
}