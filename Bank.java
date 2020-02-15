class Bank{
	final int LIMIT = 10000;

	char name;
	int age;
	int balance = 0;

	void createAccount(char name,int age){
		this.name = name;
		this.age = age;
	}

	void display(){
		System.out.println("name : "+this.name+" | age : "+this.age+" | balance : "+this.balance);
	}

	void addBalance(int amount){
		try{
			if(amount <= 0) throw new Exception("Amount must be positive");
			if(amount > LIMIT) throw new Exception("You cannot add more than "+LIMIT+" amount.");

			int new_balance = this.balance + amount;
			System.out.println("Credit: "+amount+" | new balance: "+new_balance);
			this.balance = new_balance;
		}catch(Exception e){
			System.out.println(e);
		}
		/*if(amount > 0) {
			if(amount > LIMIT){
				System.out.println("You cannot add more than "+LIMIT+" amount.");
			}
			else{
				int new_balance = this.balance + amount;
				System.out.println("Credit: "+amount+" | new balance: "+new_balance);
				this.balance = new_balance;
			}
		}else{
			System.out.println("Amount must be positive.");
		}*/
	}

	void withdrawal(int amount){
		try{
			if(amount <= 0) throw new Exception("Amount must be positive");
			if(amount > this.balance) throw new Exception("you dont have enough balance in your account.");
			if(amount > LIMIT) throw new Exception("you cannot withdraw more than "+LIMIT+" amount.");
			int new_balance = this.balance - amount;
			System.out.println("Credit: "+amount+" | new balance: "+new_balance);
			this.balance = new_balance;
		}catch(Exception e){
			System.out.println(e);
		}
		/*if(amount > 0){
			if(amount > this.balance){
				System.out.println("you dont have enough balance in your account.");
			}else if(amount > LIMIT){
				System.out.println("You cannot withdraw more than "+LIMIT+" amount.");
			}else{
				int new_balance = this.balance - amount;
				System.out.println("Credit: "+amount+" | new balance: "+new_balance);
				this.balance = new_balance;
			}
		}else{
			System.out.println("Amount must be positive.");
		}*/
	}

}
class Main{
	public static void main(String args[]){
		Bank sbi = new Bank();
		sbi.createAccount('A', 18);
		sbi.display();
		sbi.addBalance(999999999);
		sbi.addBalance(100);
		sbi.withdrawal(999999999);
		sbi.withdrawal(200);
		sbi.withdrawal(50);
		sbi.addBalance(20);
		sbi.withdrawal(70);
		sbi.display();
	}
}