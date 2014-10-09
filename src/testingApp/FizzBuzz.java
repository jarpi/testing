package testingApp;

import java.util.HashMap;
import java.util.Iterator;


public class FizzBuzz {
	public FizzBuzz() {}
	private boolean isDivisibleByX(int numberToTest, int x) {
		return numberToTest%x==0;  
	} 
	public void solveFizzBuzz() { 
		HashMap<Integer,String> numbersToTest = new HashMap<Integer,String>();
		numbersToTest.put(3, "Fizz"); 
		numbersToTest.put(5, "Buzz");
		numbersToTest.put(7, "Boom");
		numbersToTest.put(3*5, "Fizz Buzz");
		numbersToTest.put(3*7, "Fizz Boom");
		numbersToTest.put(5*7, "Buzz Boom");
		
		for (int i=1; i<100; i++) { 
			Iterator<Integer> it = numbersToTest.keySet().iterator(); 
			while (it.hasNext()) {
				Integer key = it.next();  
				if (appendIfDivisibleByNumber(i, key)) {
					System.out.println(i + " " + numbersToTest.get(key)); 
				} 
			}  
		} 
	} 
	private boolean appendIfDivisibleByNumber(int i, int number) {
		return isDivisibleByX(i,number); 
	} 
} 
