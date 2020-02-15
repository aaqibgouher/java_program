import java.util.Scanner;	//it is use to import class to our program,java is the package and util is the subpackage and Scanner is the class;we import it because in this class it is predefined in java to take input from user;
class Main{	
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);	//we used the same class that we used at the above,and obj is the object and,System.in is the format;
		System.out.println("Enter any digit");
		int a = obj.nextInt();	//here we have taken an integer var. and storing the value in that variable and using object we have taken input using nextInt() for integer,nextFloat() for float value,nextLine() for string;
		System.out.println("you have entered "+a);
	}
}