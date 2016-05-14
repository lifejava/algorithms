package chapter1;
//находим наибольшее число
public class Example1 {
  
  public int findLargest(int[] arr) {
    int largest = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
	largest = arr[i];
      }
    }
    return largest;
  }
  
  
  public static void main(String[] args) {
    Example1 example = new Example1();
    int z = example.findLargest(new int[]{1, 7, 40, 39, 60, 293, 455, 135});
    System.out.println(z);
  }
}