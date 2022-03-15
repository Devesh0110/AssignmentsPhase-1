package AccountDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Account {
public static void main(String args[]) {
	createDirectory("C:/Users/deves/AccountDevesh");
	createFile("C:/Users/deves/AccountDevesh/NewFile");
	AccountMain ob=new AccountMain("DEVESH",97989909.89);
	addContents(ob,"C:/Users/deves/AccountDevesh/NewFile");
}
public static void createDirectory(String path) {
	//CREATE A NEW DIRECTORY
		boolean f=new File(path).mkdir();
		if(f==true) {
			System.out.println("Directory Created");
		}
		else {
			System.out.println("Directory Not Created");
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
public static void addContents(AccountMain obj,String filename) {
	//ADDING OBJECT OF ACCOUNTMAIN CLASS TO FILE
	try {
	FileOutputStream fout=new FileOutputStream(filename);
	ObjectOutputStream out=new ObjectOutputStream(fout);
	out.writeObject(obj);
	
	System.out.println("Object Added to File i.e Serialization Complete");
	}
	catch(Exception e) {
		System.out.println("Exception Class:"+e.getClass());
		System.out.println("Exception Message:"+e.getMessage());
	}
}
}
