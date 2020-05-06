package Demo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Entry {

	public static void main(String[] args)
	{
		//int[] intArray = {2,3,4};
		//intArray.length;
		LinkedList<Integer>ll = new LinkedList<>();   // ll = linkedList
         ll.add(2);  // it is value not index
         ll.add(8);
         ll.add(32);
         ll.add(32);
         //ll.add(null);
         ll.add(25);
         
         ll.add(3, 99);// changing the value in particular index place
         
         
         //System.out.println(ll.get(3));  // only get iteam for newly added
        
        for(int i=0; i<ll.size();i++)
        {
        	System.out.println(" elements= "+ll.get(i));
        }
         
        Iterator<Integer> it = ll.iterator();
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
         */
        
        /* while(it.hasNext())
         {
        	 System.out.println("Items in list is = "+it.next());
         }*/
         
         Collections.sort(ll);
         for(int i=0; i<ll.size();i++)
         {
         	System.out.println(" elements= "+ll.get(i));
         }
	}

}
