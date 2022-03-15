package Bank;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class BankTest {
	public static void main(String args[]) throws IOException {
		activity();
	}
	public static void activity() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User-Name");
		String userName=sc.nextLine();
		Bank obj=new Bank(1,userName,10000.0);
		userName.trim();
		String extension=".txt";
		createFile("C:/Users/deves/"+userName+extension);
		FileWriter fw = null;
		try {
			fw=new FileWriter("C:/Users/deves/"+userName+extension);
			fw.append("UserName - "+userName+" CurrentBalance -"+Double.toString(obj.balance));
			//fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		while(true) {
		System.out.println("Enter 1 to view balance");
		System.out.println("Enter 2 to deposit amount");
		System.out.println("Enter 3 to withdraw amount");
		System.out.println("Enter 4 to exit");
		System.out.println("\nEnter choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			obj.showbalance();
			try {
				//FileWriter fw=new FileWriter("C:/Users/deves/"+userName+extension);
				fw.append("\nShow Balance -> User - "+userName+"  "+Double.toString(obj.balance));
				//fw1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			double amt=sc.nextDouble();
			String oldbalance=Double.toString(obj.balance);
			obj.deposit(amt);
			try {
				//fw = new FileWriter("C:/Users/deves/"+userName+extension);
				fw.append("\nDeposit Amount -> User"+userName+"  "+oldbalance);
				fw.append("\nDeposit Amount -> User"+userName+" "+Double.toString(obj.balance));
				//fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Enter amount to withdraw");
			double withdrawamt=sc.nextDouble();
			String originalbalance=Double.toString(obj.balance);
			String result=obj.withdraw(withdrawamt);
			if(result.equals("Insufficient Balance for withdrawal")) {
				try {
					//fw=new FileWriter("C:/Users/deves/"+userName+extension);
					fw.append("\nWithdraw Amount -> User"+userName+"  "+originalbalance);
					fw.append("\nWithdraw Amount -> Insufficient Balance for withdrawal");
					//fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else {
			try {
				//fw = new FileWriter("C:/Users/deves/"+userName+extension);
				fw.append("\nWithdraw Amount -> User"+userName+"  "+originalbalance);
				fw.append("\nWithdraw Amount -> User"+userName+" "+Double.toString(obj.balance));
				//fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			break;
		case 4:
			try {
					fw.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Choice");
		}
		
		}
	}
	public static void createFile(String filename) {
		//CREATE A NEW FILE
		File file=new File(filename);
		try {
			boolean r=file.createNewFile();
			if (r) {
				System.out.println("New File Created in the directory");
			}
			else
				System.out.println("New File Could not be created");
		}
		catch(Exception e) {
			System.out.println("Exception Class:"+e.getClass());
			System.out.println("Exception Message:"+e.getMessage());
		}
	}
}
