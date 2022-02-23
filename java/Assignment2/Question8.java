package Assignment2;

import java.util.Iterator;
import java.util.Vector;



class Employee3
{
	public int id;
	public String name;
	public double salary;

public Employee3(int id,String name,double salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public String toString() {
	return "Employee id=" + id + ", name=" + name + ", salary=" + salary ;


}
}



public class Question8 {

	public static void main(String[] args) {
      Vector<Employee3> vec= new Vector<Employee3>();
      Employee3 e = new Employee3(101,"vasu", 70000);
      Employee3 e2 = new Employee3(102,"Rohan",25000);
      vec.add(e);
      vec.add(e2);
   
     
     
    Iterator itr= vec.iterator();
    
    while(itr.hasNext())
    {
    	Employee3 emp1= (Employee3)itr.next();
    	System.out.println(emp1);
    }
    
     
      

	}

}
