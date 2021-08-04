package exception_pro;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Arraylist_remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l);  
        
        LinkedHashSet<String> s = new LinkedHashSet<String>();  
        s.addAll(l);
        System.out.println(s);  

	}

}
