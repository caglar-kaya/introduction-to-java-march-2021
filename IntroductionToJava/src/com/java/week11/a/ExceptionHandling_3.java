package com.java.week11.a;

public class ExceptionHandling_3 {

	public static void main(String[] args) {

		String [] arr = {"Java", "Gherkin", "Python"};
		
		try {
			System.out.println(arr[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out of Bound");
		} catch (Exception e) {
			System.out.println("Exception");
		}
		
		// Throwable > Exception > IndexOutOfBoundsException > ArrayIndexOutOfBoundsException
		
	}

}
