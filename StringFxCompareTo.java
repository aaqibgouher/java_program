class Main{
	public static void main(String args[]){
		String str[] = {"aaqib","aaqi","aaq","aa"};
		int n = str.length;
		int i,j;
		String temp = null;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(str[j].compareTo(str[i]) < 0){
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		for(i=0;i<n;i++){
			System.out.println(str[i]);
		}

	}
}