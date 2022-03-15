package Bank;

public class Bank {
	int id;
	String name;
	double balance;
	public Bank(int id,String name,double balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double amt) {
		balance+=amt;
		System.out.println("Balance Updated\n");
	}
	public void showbalance() {
		System.out.println("Current Balance - "+balance);
	}
	public String withdraw(double amt) {
		if(balance<amt) {
			return "Insufficient Balance for withdrawal";
		}
		else {
			balance-=amt;
			return Double.toString(balance);
		}
	}
}
