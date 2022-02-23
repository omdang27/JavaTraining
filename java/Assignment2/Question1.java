package Assignment2;

import java.util.ArrayList;

public class Question1 {
	ArrayList<Integer> list = new ArrayList<Integer>();

	ArrayList<Integer> saveEvenNumber(int N) {
		for (int i = 0; i <= N; i++) {
			if (i % 2 == 0)
				list.add(i);
		}
		System.out.println(list);
		return list;

	}

	ArrayList<Integer> printEvenNumber() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int item : list) {
			list1.add(item * 2);
			System.out.println(item * 2);

		}

		return list1;
	}

	ArrayList<Integer> printevenNumber(int N) {

//			for(int i=0;i<list.size();i++)
//			{
//				if(list.get(i)==N)
//				{
//					System.out.println("found");
//				
//				}
//			
//			}

		System.out.println("-----------");
		boolean ans = list.contains(N);
		if (ans) {
			System.out.println(N);
		} else {
			System.out.println("Zero");
		}

		return list;

	}

	public static void main(String args[]) {
		Question1 asd = new Question1();
		asd.saveEvenNumber(10);
		asd.printEvenNumber();
		asd.printevenNumber(8);
	}

}
