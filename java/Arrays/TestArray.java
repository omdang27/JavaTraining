package Arrays;

import java.util.Scanner;

public class TestArray {

	public static void main(String args[]) {

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length Of Array");
		int q = sc.nextInt();
		int a[] = new int[q];
		System.out.println("enter values");
		for (i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}

		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
