package com.Account.SingleLinkedList;

public class SingleLinkedList {
private Node head;
private int size;
public int getSize() {
	return size;
}
public boolean isEmpty() {
	return (head==null);
}
public void addtoFront(Account obj) {
	Node node=new Node(obj);
	node.setNext(head);
	head=node;
	size++;
}
public Node removefromFront() {
	Node removeNode=head;
	if(isEmpty()) {
		return null;
	}
	head=head.getNext();
	size--;
	removeNode.setNext(null);
	return removeNode;
}
public void printList() {
	Node current=head;
	System.out.print("Head-> ");
	while(current!=null) {
		System.out.print(current+"->");
		current=current.getNext();
	}
	System.out.print("null\n");
}


}
