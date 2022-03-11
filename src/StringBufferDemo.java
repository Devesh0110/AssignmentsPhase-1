
public class StringBufferDemo {
public static void main(String args[]) {
	StringBuffer s = new StringBuffer("Simplilearn");
	 
    // Getting the length of the string
    int p = s.length();

    // Getting the capacity of the string, by default it is 16
    int q = s.capacity(); //16+11=27
    
    System.out.println("Length-"+p+" Capacity-"+q);
    
    s.append('s');
    System.out.println(s);
    
    s.replace(10, 11, "a");
    System.out.println(s);
    
    s.deleteCharAt(11);
    System.out.println(s);
    
    s.delete(8, 10); // 9th and 10th deleted
    System.out.println(s);
    
    s.reverse();
    System.out.println(s);
}
}
