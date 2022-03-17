package com.Account.SingleLinkedList;

public class Accounttest {
	public static void main(String args[]) {
		SingleLinkedList list=new SingleLinkedList();
		System.out.println("Initial List size:"+list.getSize());
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("Adding from front");
		System.out.println("---------");
		list.addtoFront(new Account(100034,"DEVESH",989999.90));
		list.addtoFront(new Account(100035,"PERSON-1",18989.90));
		list.addtoFront(new Account(100036,"PERSON-2",90089.53));
		list.addtoFront(new Account(100037,"PERSON-3",7999.90));
		list.printList();
		System.out.println("---------");
		System.out.println("New List size:"+list.getSize());
		System.out.println("---------");
		System.out.println("Removing from front");
		list.removefromFront();
		System.out.println("---------");
		list.printList();
		System.out.println("---------");
		System.out.println("New List size:"+list.getSize());
		System.out.println("---------");
		System.out.println("---------");
		}
}
