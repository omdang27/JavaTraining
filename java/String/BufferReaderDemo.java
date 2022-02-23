package String;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;



		class Employee{
			   String name;
			   int id;
			   int age;
			   Employee(String name, int age, int id){
			      this.name = name;
			      this.age = age;
			      this.id = id;
			   }
			   public void displayDetails(){
			      System.out.println("Name: "+this.name);
			      System.out.println("Age: "+this.age);
			      System.out.println("Id: "+this.id);
			   }
			}
		public class BufferReaderDemo {
				public static void main(String[] args) throws IOException {
			      BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
			      System.out.println("Enter your name: ");
			      String name = reader.readLine();
			      System.out.println("Enter your age: ");
			      int age = Integer.parseInt(reader.readLine());
			      System.out.println("Enter your Id: ");
			      int id = Integer.parseInt(reader.readLine());
			      Employee std = new Employee(name, age, id);
			      std.displayDetails();
			   }
		}
		
	


