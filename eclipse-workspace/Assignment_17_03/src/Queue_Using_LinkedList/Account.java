package Queue_Using_LinkedList;
public class Account {
int accno;
String username;
double balance;
public Account(int accno, String username, double balance) {
	this.accno = accno;
	this.username = username;
	this.balance = balance;
}
@Override
public String toString() {
	return "[accno=" + accno + ", username=" + username + ", balance=" + balance + "]";
}

}
