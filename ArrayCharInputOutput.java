import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the total numbers of character:");
		n = obj.nextInt();
		char a[] = new char[n];

		for(i=0;i<n;i++){
			a[i] = obj.next().charAt(0);
		}

		for(i=0;i<n;i++){
			System.out.print(a[i]);
		}
	}
}