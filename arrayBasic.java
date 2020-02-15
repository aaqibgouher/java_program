class Main{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5};    //declaration and initialisation
		int i,j;
		int n = arr.length;          //finding the length of an array
		System.out.println("Size is "+n);

		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i] < arr[j]){
					int k = arr[i];		//swapping concept
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}

		for(i=0;i<n;i++){
			System.out.print(arr[i]);	//or we can also print like that
			System.out.print(" ");		//System.out.print(" "+arr[i]);
		}
	}
}