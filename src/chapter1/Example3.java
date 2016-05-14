package chapter1;
//возвращаем среднее значение

public class Example3 {
  
  public int dividingPoint(int[] arr) {
    int number1 = arr[0];
    int number2 = arr[arr.length - 1];
    int number3 = arr[(arr.length - 1) / 2] ;
    
    if (number1 > number2 && number1 < number3) return number1;
    if (number2 > number3 && number2 < number1) return number2;
    
    return number3;
  }
  
  public int fill(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    return dividingPoint(arr);
  }
  
  public static void main(String[] args) {
    Example3 example = new Example3();
    int s = example.fill(new int[200]);   
    System.out.println(s);
  }
}