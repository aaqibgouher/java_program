class A{
	void display(){
		System.out.println("From Parent");
	}
}
class B extends A{
	void display(){
		System.out.println("From child");
	}
}
class Main{
	public static void main(String args[]){
		A a = new A();
		a.display();

		B b = new B();
		b.display();
	}
}