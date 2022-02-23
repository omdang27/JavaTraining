package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee1
{
	public int id;
	public String name;
    public String address;
    public double salary;
    
    public Employee1(int id,String name,String address,double salary)
    {
    	this.id=id;
    	this.name=name;
    	this.address=address;
    	this.salary=salary;
    }
    
    public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	
}

public class Question5 {

	public static void main(String[] args) {
    List<Employee1> list = new ArrayList<Employee1>();
    Employee1 e = new Employee1(101,"vasu", "nadaun", 50000);
    Employee1 e1 = new Employee1(102,"Rohan", "nadaun", 50000);
    
    list.add(e);
    list.add(e1);
    System.out.println(list);
    
    int search =1055;
   // Iterator<Employee1> it =list.iterator(); 
//    while(it.hasNext())
//    {    
//    	
//    	Employee1 emp= (Employee1) it.next();
//    	System.out.println(emp.name);
//    }
    
 
    Iterator<Employee1> it =list.iterator(); 
  
    
    while(it.hasNext())
    { 
    	Employee1 emp= (Employee1) it.next();
    	if(emp.id==search)
    	{
    		System.out.println("found");
    	System.out.println(emp);
    		//System.out.println(emp.id+" "+emp.name+" "+emp.address+" "+emp.salary);
    	}
    	
    }
    	
   

	}

}
