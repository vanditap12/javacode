package exception_pro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap_generic {

	public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(1,"a");
    map.put(2,"b");
    map.put(3,"c");
    map.put(4,"d");
    map.put(5,"e");
    System.out.println(map);
    
     for(Map.Entry m: map.entrySet())
     {
    	 System.out.println(m.getKey()+" "+m.getValue());
     }
	}
}
