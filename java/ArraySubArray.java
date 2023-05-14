

public class ArraySubArray {
  public static void subarray(int numbers[]) {
    int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      for (int j = i; j < numbers.length; j++) {
        for (int k = i; k <= j; k++) {
          sum = sum + numbers[k];
          System.out.print(numbers[k] + " ");
        }
        System.out.print("Sum: " + sum);
        if (sum > max)
          max = sum;
        if (sum < min)
          min = sum;
        sum = 0;
        System.out.println("\n");
      }
    }
    System.out.println("Max subarray sum: " + max + " " + " Min subarray sum:" + min);
  }

  public static void main(String args[]) {
    int numbers[] = { 2,4,6,8,10 };
    subarray(numbers);
  }
}