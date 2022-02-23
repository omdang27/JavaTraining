package Arrays;

import java.util.Scanner;

public class IndexOfElement {
	public static int findIndex(int[] my_array, int t) {
		if (my_array == null)
			return -1;
		int len = my_array.length;
		int i = 0;
		while (i < len) {
			if (my_array[i] == t)
				return i;
			else
				i = i + 1;
		}	
		return -1;

	}

	public static void main(String args[]) {
		System.out.println("enter the array size");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int arr[] = new int[a];
		int i;
		for (i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter the number you wish to find the index of");
		int b = sc.nextInt();
		System.out.println("Index position " + findIndex(arr, b));

	}

}
