package com.java.week11.b;

public class GarbageCollection {

	public static void main(String[] args) {

		// Garbage Collection is automatic process that JVM provides for cleaning unreferenced objects
		
		/**
		 * 1) If we create anonymous object
		 * 2) If we assign our reference to a null
		 * 3) If we assign the references to each other
		 */
		
		// Anonymous object : 
		new GarbageCollection();
		
		// Assigning a reference to a null
		String string = new String("Hello");
		string = null;
		
		// Assigning the reference to each other
		String string2 = new String("Silicone Labs");
		String string3 = new String("Boot Camp");
		string2 = string3;
		
		System.out.println(string2); // Boot Camp
		System.out.println(string3); // Boot Camp
		
		System.gc();
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collected");
	}

}
