//7. Write a Java program to count how many times the substring 'life' present at anywhere in a given string.


package Assignment;

public class CountString {

	public static void main(String[] args) {
		
		 String text = "LIVEONWIOLDLIFE";
	        String str = "LIFE";
	 
	        int count = countMatches(text, str);
	        System.out.println(count);
		
		
		
}
	 
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
 
  
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }
 
        return count;
	
	
	
	
}
}