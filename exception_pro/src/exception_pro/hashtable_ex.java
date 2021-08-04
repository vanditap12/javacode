package exception_pro;

import java.util.Hashtable;
import java.util.Map;

public class hashtable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hashtable<Integer,String>  ht= new Hashtable<Integer,String>();
       
       ht.put(1,"abc");
       ht.put(2, "bcd0");
       
       for(Map.Entry ref: ht.entrySet())
       {
    	   no(ref.getKey()+" "+ref.getValue());
       }
       
	}

}
