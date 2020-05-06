package Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Entry4 {

	public static void main(String[] args)
	{
		//HashMap<Integer,String>hm = new HashMap<>(); //no order
		//LinkedHashMap<Integer,String>hm = new LinkedHashMap<>();  // incerted order
		TreeMap<Integer,String>hm = new TreeMap<>(); // Assending order
         hm.put(10,"Vinod");
         hm.put(40,"Mithun");
         hm.put(30,"Srinidhi");   //  if you give same key it will be overright it because one key refers only one value
         
        for(String s : hm.values())
         {
        	 System.out.println(s);
         }
	}

}
