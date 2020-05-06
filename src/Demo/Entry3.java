package Demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Entry3 {

	public static void main(String[] args) 
	{     
		//HashSet<Integer>hs = new HashSet<>();   // result is different when printing each time different result you get
		//LinkedHashSet<Integer>hs = new LinkedHashSet<>();  // incertion order maintain
		TreeSet<Integer>hs = new TreeSet<>();  // Assending order sorted form
        hs.add(2);  
        hs.add(98);
        hs.add(32);
        hs.add(32);
       // hs.add(null);
        hs.add(25);
       
        Iterator<Integer> it = hs.iterator();
       
        while(it.hasNext())
        {
       	 System.out.println("Items in list is = "+it.next());
        }
	}

}
