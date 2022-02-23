package Arrays;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter array size: ");
        int size = s.nextInt();
     
        int[] array = new int[size];
 
       
        System.out.println("Enter array values :  ");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
             
 
        }
 
     
        int length = array.length;
 
       
        int sum = 0;
 
       
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
 
        System.out.println("Average of array : " + average);
 
    }

	}


