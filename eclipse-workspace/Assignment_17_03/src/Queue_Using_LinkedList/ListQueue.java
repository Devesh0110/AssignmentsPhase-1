package Queue_Using_LinkedList;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
public class ListQueue {
List<Account> list;
int c=-1;
public ListQueue() {
	list=new LinkedList<Account>();
}
public void add(Account obj) {
	list.add(obj);
}
public Account remove() {
	c++;
	if(c>list.size()) {
		System.out.println("List is not having elemem=nts to remove");
	}
	return list.remove(c);
}
public int size() {
	return list.size();
}
public Account peek() {
	if(size()==0) {
		System.out.println("List Empty");
	}
	return list.get(0);
}
public void printList() {
	for(Account i:list) {
		System.out.println(i);
	}
}
}
