 class Polynomial{
	int a,b,c;
	Polynomial(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void display(){
		// still not correct, i want + sign also. 2x^2-3x+4 like this
		System.out.println((this.a)+"X^2  "+(this.b)+"X  "+(this.c));
	}

	void add(Polynomial obj){
		// write add functionality here
		// u can use incremental operator +=
		this.a = this.a + obj.a;
		this.b = this.b + obj.b;
		this.c = this.c + obj.c;
	}

	// wtf, why u r passing poly obj to find its coeff. u already have no. 
	void polyCoeff(Polynomial obj){
		System.out.println("a = "+this.a+" b = "+this.b+" c = "+this.c);
		System.out.println("a = "+obj.a+" b = "+obj.b+" c = "+obj.c);
	}
}

class Main{
	public static void main(String args[]){
		Polynomial poly = new Polynomial(2,-3,4);
		poly.display();

		// another poly
		Polynomial poly_another = new Polynomial(1, 2, 3);
		poly_another.display();
		poly.polyCoeff(poly_another); // this method call is shit
		poly.add(poly_another);
		poly.display();
	}
}