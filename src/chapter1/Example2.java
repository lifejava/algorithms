package chapter1;
//смотрим дубликаты в массиве(нелучший вариант) 

public class Example2 {
  public boolean isContainsDuplicates (int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
	if (i != j) {
	  if(arr[j] == arr[i]) return true;
	}
      }
    }
    return false; 
  }
  
  public static void main(String[] args) {
    Example2 example = new Example2();
    boolean isDuplicat = example.isContainsDuplicates(new int[]{1, 7, 6, 5, 7});
    System.out.println(isDuplicat);
  }
}