import java.util.*;

public class Prime {

	static final int MAX_PRIME = 100;
	static int floor = 7;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> primes = new LinkedList<Integer>();
		
			primes.add(1);
			primes.add(2);
			primes.add(3);
			primes.add(5);
			primes.add(7);
		
		while(floor < MAX_PRIME) {
		  
		  for( Integer e: primes ) {	
			System.out.println(e);
		  }
		  int temp = 8/7;
		  System.out.println(temp);
		  floor = 100;
		}

	}

}
