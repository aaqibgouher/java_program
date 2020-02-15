import java.util.Scanner;
//how to scan string:
class Main{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any name ");
		String name = obj.nextLine();
		System.out.println("You have entered "+name);
	}
}

//how to scan character:
class Main{
	public static void main(String.args[]){
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter any character ");
		char c = obj1.next().charAt(0);
		System.out.println("you have entered "+c);
	}
}
