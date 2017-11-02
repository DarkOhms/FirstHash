
public class FirstHash {
  static int HASH_SIZE = 31;
  int[] hash = new int[HASH_SIZE];
  
  int hash(key) {
	  return key%HASH_SIZE;
  }
}
