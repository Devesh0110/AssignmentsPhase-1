package AccountDemo;

import java.io.Serializable;

public class AccountMain implements Serializable {
	String name;
	double balance;
	public AccountMain(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
}
