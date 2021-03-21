package com.java.week09.a;

import java.util.Arrays;

public class MultiplicationTable implements TableGenerator{

	 /**
     * returns a multiplication table of
     * specified number with a specified length.
     * @param value - the multiplication table returned will be of that number
     *              ( for example 5 will return: 0,5,10,15...).
     * @param numberOfEntries - the number of entries (positions)  the returned array will hold (for example
     *                        if its 3 the returned array will have 3 ints.
     * @return an int array containing a multiplication table.
     *
     * Example:
     *  generate_table(3,5);
     * returns: [0,3,6,9,12]
     *  each number is multiplier of 3, starts from 0
     *
     *  generate_table(9,3);
     *  returns: [0,9,18]
     */
     //create your method here
	
	@Override
	public int[] generateTable(int value, int numberOfEntries) {
		
		int [] multiplicationTable = new int[numberOfEntries];
		
		for (int i = 0; i < numberOfEntries; i++) {
			multiplicationTable[i] = i * value;
		}
		
		return multiplicationTable;
	}

    /**
     * checks if a multiplication table is of the correct values
     * and correct sequence for the given
     * @param value
     * @param tableToTest
     * @return true or false
     *
     * Please look at examples below:
     *
     *
    mult = [0,3,6,9,12,15]
    check_table(3,mult);
    returns:true since each number in array is multiplication
    for 3

    mult = [0,3,6,999,12,15]
    check_table(3,mult);
    returns:false

    mult = [0,9,18]
    check_table(9,mult);
    returns:true

    mult = [0,9,18]
    check_table(3,mult);
    returns:false
     */
     //create your method here
      
	@Override
	public boolean checkTable(int value, int[] tableToTest) {
		boolean result = false;
		if (tableToTest[0] == 0) {
			result = true;
		}
		for (int i = 0; i < tableToTest.length-1; i++) {
			if (tableToTest[i+1] - tableToTest[i] != value) {
				result = false;
			}
		}
		return result;
	}
}

class Main {
	
	public static void main(String[] args) {
		
	  MultiplicationTable table1 = new MultiplicationTable();
	  
	  int [] multTable1 = table1.generateTable(3, 5);
	  System.out.println(Arrays.toString(multTable1)); // [0, 3, 6, 9, 12]
	  
	  int [] multTable2 = table1.generateTable(9, 3);
	  System.out.println(Arrays.toString(multTable2)); // [0, 9, 18]
	  
	  int [] multTable3 = {0,3,6,9,12,15};
	  System.out.println(table1.checkTable(3, multTable3)); // true
	  
	  int [] multTable4 = {0,3,6,999,12,15};
	  System.out.println(table1.checkTable(3, multTable4)); // false 
	  
	  int [] multTable5 = {0,9,18};
	  System.out.println(table1.checkTable(9, multTable5)); // true
	  
	  int [] multTable6 = {0,9,18};
	  System.out.println(table1.checkTable(3, multTable6)); // false
	}
	
}

