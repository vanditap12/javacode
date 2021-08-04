package exception_pro;

import java.util.Map;
import java.util.TreeMap;

public class tree_map {

	public static void main(String[] args) {
		
	TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(1,"a");
	tm.put(2,"b");
	tm.put(3,"c");
	tm.put(4,"d");
	
	for(Map.Entry ref: tm.entrySet())
	{
		System.out.println(ref.getKey()+" "+ref.getValue());
	}
	}
}
