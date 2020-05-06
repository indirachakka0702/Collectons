package Demo;

public class Student implements Comparable<Student>  // this called custom data type due to created by developer so total responsibily is developer
{
    public String name;
    public int Id;
    public int height;
    
    Student(String name, int Id, int height)
    {
    	this.name = name;
    	this.Id = Id;
    	this.height = height;
    }

	@Override
	public int compareTo(Student s) {
		// return 0 means both are equal
		// -ve means this is bigger
		// +ve means the input is bigger
		
		//return s.Id - this.Id ;
		//return this.Id - s.Id;
		//return this.height - s.height;
		//return this.name.compareTo(s.name);
		return this.name.compareTo(s.name)*-1; // if you want decending order then multiply with -1
		//return 0;
	}
    
}
