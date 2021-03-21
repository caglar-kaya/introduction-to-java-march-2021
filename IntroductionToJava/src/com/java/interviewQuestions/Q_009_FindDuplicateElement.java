package com.java.interviewQuestions;

public class Q_009_FindDuplicateElement {

	public static void main(String[] args) {

		Integer [] arr = {2,4,6,8,6,3,5,7,8};
		
		String [] str = {"A", "B", "C", "D", "A", "C"};
		
		findDuplicate(arr);
		
		findDuplicate(str);
		
 	}
	
	static void findDuplicate(Object arr []) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
