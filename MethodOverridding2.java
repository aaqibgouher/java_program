class New1{
	int x;

	New1(int x){
		this.x = x;    //constructor of parent class
	}

	void display(){
		System.out.println("x = "+x);
	}
}

class New extends New1{
	int y;

	New(int x,int y){
		super(x);		//constructor of chind class
		this.y = y;
	}

	void display(){
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
class Main{
	public static void main(String args[]){
		New obj = new New(1,2);
		obj.display();
	}
}