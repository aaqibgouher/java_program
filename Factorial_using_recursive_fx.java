class Form{
	int fact = 1;

	int fact(int f){
		if(f == 0) return 1;
		else return(f * fact(f-1));
	}

}
class New{
	public static void main(String args[]){
		Form x = new Form();
		int n = 5;
		int m = x.fact(n);
		System.out.println("fact of "+n +" is "+m); 
	}
}