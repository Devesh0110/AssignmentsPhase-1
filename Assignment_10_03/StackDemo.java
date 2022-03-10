import java.io.*;
import java.util.*;
public class StackDemo {
public static void main(String args[]){
	Stack<Integer> m=new Stack<Integer>();
	m.push(20);
	m.push(30);
	m.push(50);
	System.out.println("Stack after insertion\n");
	for(int value:m) {
		System.out.print(value+" ");
	}
	m.pop();
	System.out.println("\nStack after deletion of element\n");
	for(int value:m) {
		System.out.print(value+" ");
	}
	
}
}
