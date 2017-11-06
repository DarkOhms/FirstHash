
public class FirstHash {
	
  static int HASH_SIZE = 31;
  hashItem<T>[] hash = new hashItem<T>[HASH_SIZE];
  
  
  int hash(key) {
	  return key%HASH_SIZE;
  }
}

protected class hashItem<T extends Comparable <T>> {
  int key;
  T data;
}
