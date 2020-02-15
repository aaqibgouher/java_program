import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		int a[][] = new int[2][2];
		int i,j;
		System.out.println("Enter the elements:");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				a[i][j] = obj.nextInt();
			}
		}

		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}