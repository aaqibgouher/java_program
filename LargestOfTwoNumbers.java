class New{
	int findMax(int x,int y){
		if(x > y) return x;
		else return y;
	}
}
class Main{
	public static void main(String args[]){
		New obj = new New();
		int large = obj.findMax(2,3);
		System.out.println("Largest is "+large); 
	}
}