class New{
	void pattern1(int y){
		int i,j;

		for(i=0;i<y;i++){
			for(j=0;j<=i;j++){
				//if(i % 2 == 0)
				System.out.print("# ");
				//else System.out.print("  ");
			}
			System.out.print("\n");
		}
	}

	void pattern2(int x){
		int i1,j1;

		for(i1=x;i1>=0;i1--){
			for(j1=0;j1<=i1;j1++){
				//if(i1 % 2 == 0)
				System.out.print("# ");
				//else System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}
class Main{
	public static void main(String args[]){
		New file = new New();
		int n = 5;
		file.pattern1(n);
		file.pattern2(n);
	}
}