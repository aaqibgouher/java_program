class Polynomial{
	int a,b,c;
	Polynomial(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void display(){
		// correct this function becoz b is negative still it is printing +
		System.out.println((this.a)+"X^2 + "+(this.b)+"X + "+(this.c));
	}

	void add(Polynomial obj){
		// write add functionality here
	}
}

class Main{
	// kya chutiya code likhe ho be
	public static void main(String args[]){
		Polynomial poly = new Polynomial(2,-3,4);
		poly.display();

		// another poly
		Polynomial poly_another = new Polynomial(1, 2, 3);
		poly_another.display();
		poly.add(poly_another);
		poly.display();
	}
}