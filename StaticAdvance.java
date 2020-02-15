class Temp{
	public static int temp = 1;

	int getTemp(){
		return this.temp;
	}

	void setTemp(int temp){
		this.temp = temp;
	}
}
class Main{
	public static void main(String args[]){
		Temp temp1 = new Temp();
		System.out.println(temp1.getTemp());

		temp1.setTemp(2);
		System.out.println(temp1.getTemp());
		
		Temp temp2 = new Temp();
		System.out.println(temp2.getTemp());
	}
}