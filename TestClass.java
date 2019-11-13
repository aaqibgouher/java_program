class Polynomial{
	int a,b,c;
	Polynomial(int x1,int y1,int z1){
		this.a = x1;
		this.b = y1;
		this.c = z1;
	}

	void display(){
		System.out.println((this.a)+"X^2 + "+(this.b)+"X + "+(this.c)+"X^0");
	}

	void getCoeff(){
		System.out.println("x = "+(this.a)+" y = "+(this.b)+" z = "+(this.c));
	}
}

class Main{
	public static void main(String args[]){
		Polynomial poly1 = new Polynomial(2,3,4);
		Polynomial poly2 = new Polynomial(6,-7,8);
		poly1.display();
		poly2.display();
		poly1.getCoeff();
		poly2.getCoeff();
		System.out.println("Sum of two quadratic equation is :");
		System.out.println((poly1.a + poly2.a)+"X^2 + "+(poly1.b + poly2.b)+"X + "+(poly1.c + poly2.c)+"X^0");
	}
}