package com.java.week10.b;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {

		// First-in-first-out
		
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		
		priorityQueue.add("MACOS");
		priorityQueue.add("Windows");
		priorityQueue.add("Android");
		priorityQueue.add("Linux");
		priorityQueue.add("Ubuntu");
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek()); // gets first element
		
		System.out.println(priorityQueue.poll()); // delete first element and returns it
		
		System.out.println(priorityQueue); 
		
		System.out.println(priorityQueue.element()); // Linux
		
		Iterator<String> iterator = priorityQueue.iterator();
		
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
	}

}
