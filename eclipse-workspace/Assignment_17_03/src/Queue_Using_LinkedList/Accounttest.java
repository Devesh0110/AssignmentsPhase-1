package Queue_Using_LinkedList;


public class Accounttest {
	public static void main(String args[]) {
		ListQueue list=new ListQueue();
		System.out.println("Initial List size:"+list.size());
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("Adding from front");
		System.out.println("---------");
		list.add(new Account(100034,"DEVESH",989999.90));
		list.add(new Account(100035,"PERSON-1",18989.90));
		list.add(new Account(100036,"PERSON-2",90089.53));
		list.add(new Account(100037,"PERSON-3",7999.90));
		list.printList();
		System.out.println("---------");
		System.out.println("Front Element:"+list.peek());
		System.out.println("---------");
		System.out.println("New List size:"+list.size());
		System.out.println("---------");
		System.out.println("Removing from front");
		list.remove();
		System.out.println("---------");
		list.printList();
		System.out.println("---------");
		System.out.println("Front Element:"+list.peek());
		System.out.println("---------");
		System.out.println("New List size:"+list.size());
		System.out.println("---------");
		System.out.println("---------");
		}
}
