package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Entry2 {

	public static void main(String[] args)
	{
		ArrayList<Student> studentList2 = new ArrayList<>();
		
		LinkedList<Student> studentList = new LinkedList<>();
		
		studentList.add(new Student("Abi",1,150));
		studentList.add(new Student("Akki",4,143));
		studentList.add(new Student("Kumar",3,122));
		studentList.add(new Student("Kiran",2,195));
		
		Iterator<Student> it3 = studentList.iterator();
		 while(it3.hasNext())
         {
			 Student tempStudent = it3.next();
        	 System.out.println("1. Student: "+ tempStudent.Id + " name is " + tempStudent.name);
         }
		
		Collections.sort(studentList);
		Iterator<Student> it4 = studentList.iterator();
		 while(it4.hasNext())
        {
			 Student tempStudent = it4.next();
       	 System.out.println("2. Student: "+ tempStudent.Id + " name is " + tempStudent.name);
        }
	}

}
