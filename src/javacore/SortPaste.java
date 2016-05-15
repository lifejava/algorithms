package javacore;
//сортировка вставкой
public class SortPaste{

   public void count (int[] arr) {
      for(int i = 0; i < arr.length; i++) {
	int tmp = arr[i];
	int j = i - 1;
	while (j >= 0 && arr[j] > tmp) {
	  arr[j+1] = arr[j];
	  j--;
	}
	arr[j+1] = tmp;
      }
      for (int z = 0; z < arr.length; z++) {
	System.out.println(arr[z]);
      }
   }
   
   
   public static void main(String[] args) {
    SortPaste sp = new SortPaste();
    sp.count(new int[]{9, 8, 6, 7, 3, 2, 1, 4, 5, 0});
  }
}