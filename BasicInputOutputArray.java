import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the total number of elements:");
		n = obj.nextInt();
		int a[] = new int[n];		//declaraation of array.
		System.out.println("Enter the elements in array : ");
		for(i=0;i<n;i++){
			a[i] = obj.nextInt();		//taking input and storing it at its index.
		}

		for(i=0;i<n;i++){
			System.out.print(+a[i]);
			System.out.print(" ");
		}		
	}
}