package com.java.week10.a;

@FunctionalInterface
interface PerformOperation2 {
	void isPalindrome(int n);
}

public class Question2 {
	
	public static void main(String[] args) {
		
		PerformOperation2 obj = (n) -> {
			int r, sum=0, temp;
				temp = n; 
					while(n > 0) {
						r = n % 10; 
					    sum = (sum*10) + r;
					    n = n / 10;
					}
		    if (temp == sum)    
		    	System.out.println(temp + " is a palindrome number.");    
		    else    
		    	System.out.println(temp + " is not a palindrome number.");   
		};
		
		obj.isPalindrome(454);
		obj.isPalindrome(735);
		obj.isPalindrome(1001); 
	}
}
