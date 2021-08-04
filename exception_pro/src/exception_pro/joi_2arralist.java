package exception_pro;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class joi_2arralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l = new ArrayList<String>();  
        l.add("A");  
        l.add("B");  
        l.add("C");  
        l.add("D");  
        System.out.println(l);  
        
        ArrayList<String> l1 = new ArrayList<String>();  
        l1.add("1");  
        l1.add("2");  
        l1.add("3");  
        l1.add("4");  
        System.out.println(l1); 
         
        l.addAll(l1);
        System.out.println(l);  

	}
}
