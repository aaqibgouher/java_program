class Account{
	public String name, type;
	public int account_no, balance = 0;

	Account(String name,int account_no, String type){
		this.name = name;
		this.account_no = account_no; 
		this.type = type;
	}

	public void display(){
		System.out.println("name : "+this.name+" | type : "+this.type+" | balance : "+this.balance);
	}

	public void deposit(int amount){
		try{
			int new_balance = this.balance + amount;
			this.balance = new_balance;

			System.out.println("deposit : "+amount+" | total : "+new_balance);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void withdraw(int amount){
		try{
			int new_balance = this.balance - amount;
			if(new_balance < 0) throw new Exception("you havent sufficient balance:");
			if(this.type == "current" && new_balance < 100) throw new Exception("you have to maintain min balance of 100");
			this.balance = new_balance;

			System.out.println("withdraw : "+amount+" | total : "+new_balance);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
class Current extends Account{
	Current(String name,int account_no){
		super(name, account_no, "current"); 
	}
}

class Saving extends Account{
	Saving(String name,int account_no){
		super(name, account_no, "saving");
	}
}

class Main{
	public static void main(String args[]){
		Saving nazish = new Saving("Nazish", 12234343);
		nazish.display();
		nazish.deposit(100);
		nazish.withdraw(50);
		nazish.display();

		Current aaqib = new Current("Aaqib", 878989);
		aaqib.display();
		aaqib.deposit(200);
		aaqib.withdraw(150);
		aaqib.withdraw(50);
		aaqib.display();
	}
}