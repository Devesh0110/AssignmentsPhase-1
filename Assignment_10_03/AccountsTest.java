import java.util.Arrays;
public class AccountsTest {
	public static void main(String args[]) {
		Accounts a[]=new Accounts[2];
		Accounts obj=new Accounts(1,"Dev",9000.0f);
		a[0]=obj;
		a[1]=new Accounts(2,"Sample name",389.98f);
		System.out.println("Account Details:-\n");
		for(Accounts value:a) {
			System.out.println(Arrays.toString(a));
		}
	}

}
