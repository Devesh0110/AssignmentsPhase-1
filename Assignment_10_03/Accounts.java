
public class Accounts {
int id;
String name;
float balance;
public Accounts(int id,String name,float balance){
	this.id=id;
	this.name=name;
	this.balance=balance;
}
public String toString() {
	return id+" "+name+" "+balance;
}

}
