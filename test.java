import package2.ClassB;
class ClassC extends ClassB{
	int n = 20;
	void display(){
		System.out.println("Class C");
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}
}

class PackageTest3{
	public static void main(String args[]){
		ClassC objectC = new ClassC();
		objectC.displayB();
		objectC.displayC();
	}
}