package testingApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class FizzBuzz {
	private class testNumber {
		private int[] numbers; 
		private String message; 
		public testNumber(int[] numbers, String message) {
			this.numbers = numbers; 
			this.message = message; 
		} 
		public testNumber(int[] numbers) {new testNumber(numbers,"random message" + numbers[0]);} 
		public int[] getNumbers() { return this.numbers; }  
		public String getMessage() { return this.message; } 
	}
	
	ArrayList<testNumber> numbersToTest = new ArrayList<testNumber>(); 
	
	public FizzBuzz() { 
		numbersToTest.add(new testNumber(new int[]{3},"Fizz"));
		numbersToTest.add(new testNumber(new int[]{5},"Buzz"));
		numbersToTest.add(new testNumber(new int[]{7},"Boom"));
		numbersToTest.add(new testNumber(new int[]{3,5},"Fizz Buzz"));
		numbersToTest.add(new testNumber(new int[]{3,7},"Fizz Boom"));
		numbersToTest.add(new testNumber(new int[]{5,7},"Buzz Boom")); 
	}
	private boolean isDivisibleByX(int numberToTest, int x) {
		return numberToTest%x==0;  
	} 
	
	public void solveFizzBuzz() { 
		for (int i=1; i<100; i++) { 
			for (int j=0; j<numbersToTest.size();j++) {
				testNumber objTest = numbersToTest.get(j); 
				boolean areAllNumbersDivisible = true; 
				for (int k=0; k<objTest.getNumbers().length;k++) {
					if (!isDivisibleByX(i,objTest.getNumbers()[k])) areAllNumbersDivisible = false;   
				} 
				if (areAllNumbersDivisible) System.out.println(objTest.getMessage()); 
			}
		} 
	} 
} 
