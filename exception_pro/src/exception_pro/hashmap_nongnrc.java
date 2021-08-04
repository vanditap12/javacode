package exception_pro;
import java.util.*;
public class hashmap_nongnrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap map=new HashMap();
       map.put(1,"a");
       map.put(2,"b");
       map.put(3,"c");
       map.put(4,"d");
       map.put(5,"e");
       System.out.println(map);
       
       Set set=map.entrySet();
       Iterator it=set.iterator();
       
       while(it.hasNext())
       {
    	   Map.Entry entry=(Map.Entry)it.next();
    	   System.out.println(entry.getKey()+" "+entry.getValue());
       }
	}

}
