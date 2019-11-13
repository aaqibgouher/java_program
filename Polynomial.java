 class Polynomial{
	int a,b,c;
	Polynomial(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void display(){
		// still not correct, i want + sign also. 2x^2-3x+4 like this
		if(this.a != 0) System.out.print(this.a+"x^2");

		if(this.b != 0){
			if(this.b>0) System.out.print("+");
			System.out.print(this.b+"x");
		}

		if(this.c != 0){
			if(this.c>0) System.out.print("+");
			System.out.print(this.c);
		}
		System.out.print("\n");
	}

	void add(Polynomial obj){
		this.a = this.a + obj.a;
		this.b = this.b + obj.b;
		this.c = this.c + obj.c;
	}
}

class Main{
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