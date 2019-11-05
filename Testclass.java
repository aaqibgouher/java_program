class New{
	int length,breadth;

	New(int x,int y){
		this.length = x;
		this.breadth = y;
	}

	int findArea(){
		return this.length * this.breadth;
	}

	int findPeri(){
		return (2*(this.length + this.breadth));
	}
}
class Main{
	public static void main(String args[]){
		New rect = new New(5,5);
		int area = rect.findArea();
		int peri = rect.findPeri();

		System.out.println("Length is "+rect.length);
		System.out.println("Breadth is "+rect.breadth);
		System.out.println("Area is "+area);
		System.out.println("Perimeter is "+peri);
	}
}