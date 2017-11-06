import java.util.*;

public class Prime {

	static final int MAX_PRIME = 100;
	static int floor = 7;
	static int nextPrime;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
			primes.add(1);
			primes.add(2);
			primes.add(3);
			primes.add(5);
			primes.add(7);
			primes.add(11);
			
		int thisFloor = primes.getLast();
		nextPrime = thisFloor;
		
		thisFloor++;
		while(thisFloor < MAX_PRIME) {
		  
		//print the list
		  for( Integer e: primes ) {
			System.out.println(e);
		  }
		  
		  int maxToTest = (int)Math.sqrt((double)thisFloor);
		  System.out.println("Maximum prime to test through: " + maxToTest);
		  for(int i = 1; primes.get(i) < maxToTest;) {
			int testResult;
			int primeToCheck = primes.get(i);
			testResult = thisFloor%primes.get(i);
			
			if(testResult == 0) {
				thisFloor++;
				maxToTest = (int)Math.sqrt((double)thisFloor);
				i=1;
			}else {
				i++;
			}
		  }
		  nextPrime = thisFloor;
		  primes.add(nextPrime);
		  System.out.println("The next prime is: " + nextPrime);
		  thisFloor++;
		 
		  
		}

	}
	

}
