import Operations.Test;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("\nEnter 1 for buying a product");
		System.out.println("Enter 2 to sell product to the shop as a wholeseller");
		System.out.println("Enter 3 to view all products");
		System.out.println("Enter 4 to exit");
		System.out.println("\nEnter choice");
		int ch=sc.nextInt();
		Test obj=new Test();
		
		switch(ch) {
		case 1:
			System.out.println("\nEnter Product name to purchase");
			String n=sc.next();
			obj.buy(n);
			break;
		case 2:
			System.out.println("Welcome Wholeseller\n");
			System.out.println("Enter the product name to sell");
			String sp=sc.next();
			System.out.println("As a shopkeeper do you want to buy this? Enter 1 for yes");
			int a=sc.nextInt();
			obj.sell(sp, a);
			break;
		case 3:
			obj.view();
			break;
		case 4:
			System.out.println("Thank you for shopping");
			System.exit(0);
		default:
			System.out.println("Wrong choice");
		}
		}
	}
}
