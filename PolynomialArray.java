 class Polynomial{
 	final static int N = 10;
 	int coeff[]; int degree; int coeff_length;

	Polynomial(int arr[]){
		coeff = new int[N];

		int arr_length = arr.length;

		for(int i=0;i<arr_length;i++){
			this.coeff[i] = arr[i];
		}

		this.degree = arr_length - 1;
		this.coeff_length =  arr_length;
	}

	void display(){
		for(int i=0;i<this.coeff_length;i++){
			this.display_loop(i);
		}
		System.out.print("\n");
	}

	void display_loop(int i){
		int data = this.coeff[i];
		int power = this.coeff_length - i - 1;

		if(data != 0){
			if(data > 0) System.out.print("+");
			if(data != 1 || true) System.out.print(data);
			if(i != this.coeff_length - 1) System.out.print("x");
			if(i < this.coeff_length - 2) System.out.print("^");
			if(power != 0){
				if(power != 1) System.out.print(power);
			}
		}
	}

	void add(Polynomial obj){
		int max = 4;//(this.coeff_length > obj.coeff_length) ? this.coeff_length : obj.coeff_length;

		// rever this.coeff
		// rev obj.coeff
		// do the additon part
		// rev again
		// this.coeff = new rev array using for loop
	}

	int[] reverse(int a[]){
		int n = a.length;
		int t;
		for(int i=0;i<n/2;i++){
			t = a[i];
			a[i] = a[n-i-1];
			a[n-i-1] = t;
		}

		return a;
	}
}

class Main{
	public static void main(String args[]){
		int coeff[] = {2, -3, 4, 1};
		Polynomial poly = new Polynomial(coeff);
		poly.display();

		int coeff_new[] = {1,-2, 3, 4};
		Polynomial poly_new = new Polynomial(coeff_new);
		poly_new.display();

		poly.add(poly_new);

		poly.display();
	}
}