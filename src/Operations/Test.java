package Operations;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class Test {
	double price;
	int qty;
	HashMap<String,Double> values=new HashMap<String,Double>();
	Scanner sc=new Scanner(System.in);
	public Test(){
		price=0.0;
		qty=0;
		values.put("Soap", 100.0);
		values.put("Toothpaste",90.0);
	}
	public void buy(String name) {
		Set s=values.entrySet();
		Iterator iter=s.iterator();
		int f=0;
		while(iter.hasNext()) {
			Map.Entry m=(Map.Entry)iter.next();
			String cpy=(String)m.getKey();
			if(cpy.equals(name)) {
				System.out.println("Item Available for Purchase");
				f=1;
				break;
			}
		}
		if(f==0) {
			System.out.println("Item Unavailable");
		}
	}
	public void sell(String product, int choice) {
		if(choice==1) {
		
		System.out.println("\n As a shopkeeper, select price for this product");
		double p=sc.nextDouble();
		values.put(product, p);
		System.out.println("Product purchased by shop owner");
		//break;
		}
		else {
			System.out.println("Shop Not interested to purchase this from wholeseller");
		}
	}
	public void view() {
		System.out.println("List of all Available products- \n");
		Set s=values.entrySet();
		Iterator iter=s.iterator();
		while(iter.hasNext()) {
			Map.Entry m=(Map.Entry)iter.next();
			System.out.println("Product - "+ m.getKey()+"|| Price - "+m.getValue());
		}
	}
	
}
