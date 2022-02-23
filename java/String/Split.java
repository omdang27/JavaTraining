package String;
import java.util.Arrays;
public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java string split method by me";  
		String[] words=s1.split("\\s");
     
		
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
}
}
