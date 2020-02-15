class New{
	int length,breadth;

	New(int x,int y){
		this.length = x;
		this.breadth = y;
	}

	int findArea(){
		return (this.length *this.breadth);
	}

	int findPeri(){
		return ((2*(this.length + this.breadth)));
	}
}

class New1{
	int edge;

	New1(int a){
		this.edge = a;
	}

	int findArea(){
		return this.edge * this.edge;
	}

	int findPeri(){
		return (4*this.edge);
	}
}
class Main{
	public static void main(String args[]){
		New rect = new New(5,2);
		New1 square = new New1(10);
		int arear = rect.findArea();
		int perir = rect.findPeri();
		int areas = square.findArea();
		int peris = square.findPeri();
		System.out.println("Rectangle");
		System.out.println("Length is "+rect.length +" Breadth is "+rect.breadth);
		System.out.println("Area is "+arear);
		System.out.println("perimeter is "+perir);
		System.out.print("\n");
		System.out.println("Square");
		System.out.println("Edge is "+square.edge);
		System.out.println("Area is "+areas);
		System.out.println("Perimeter is "+peris);
	}
}