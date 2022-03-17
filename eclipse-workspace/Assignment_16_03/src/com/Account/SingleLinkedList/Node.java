package com.Account.SingleLinkedList;

public class Node {
private Account data;
private Node next;
public Node(Account data) {
	this.data=data;
}
public Account getData() {
	return data;
}
public void setData(Account data) {
	this.data = data;
}
public Node getNext() {
	return next;
}
public void setNext(Node next) {
	this.next = next;
}
@Override
public String toString() {
	return data.toString();  //IMP
}
}
