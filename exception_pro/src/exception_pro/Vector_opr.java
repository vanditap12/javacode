package exception_pro;

import java.util.Vector;

public class Vector_opr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vc = new Vector<Integer>();  
		Vector<Integer> vecclone = new Vector<Integer>();
        vc.add(4);  
        vc.add(3);  
        vc.add(2);  
        vc.add(1);
        
        System.out.println("Elements in vector are: "+vc);
        
        vecclone = (Vector) vc.clone();
        
        System.out.println("Elements in vecclone vector are: "+vecclone); 

	}

}
