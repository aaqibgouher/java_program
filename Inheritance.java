class A{
	int a=10;

	int get(){
		return this.a;
	}
}
class B extends A{
	int b=5;

	int getChild(){
		return this.b;
	}
}
class Main{
	public static void main(String args[]){
		A a = new A();
		System.out.println("from parent var : "+a.a);
		System.out.println("from parent method : "+a.get());

		B b = new B();
		System.out.println("from child var : "+b.a);
		System.out.println("from child method : "+b.get());
		System.out.println("from child var : "+b.b);
		System.out.println("from child method : "+b.getChild());
	}
}