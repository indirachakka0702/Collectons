package Demo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Entry5 
{
   public static void main(String[] args)
   {
	// Queue<String> q = new LinkedList<>(); // FIFO
	 Stack<String> q = new Stack<>();  //FILO
	 q.add("vinod");  //poll
	 q.add("Neha");
	 q.add("swetha");
	 q.add("priya");
	 q.add("Anthony");
	 
	  int qSize = q.size();
	  //q.toArray();
	  for(int i=0;i<qSize;i++)
	  {
		  System.out.println(q.pop());   // for Stack only
		 // System.out.println(q.poll()); // for queue only
		 //System.out.println(q.peek());   // for stack and queue
		 System.out.println(q.size());
		
	  }
   }
}
