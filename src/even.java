public class even {
  public static void main(String[] args) {
      int sum = 0;
      int count = 0;
      int i = 20;

      do {
          if (i % 2 == 0) {
              System.out.print(i + " ");
              sum += i;
              count++;
          }
          i++;
      } while (i <= 100);


      int average = sum / count;

      System.out.println("\nSum of even numbers: " + sum);
      System.out.println("Average of even numbers: " + average);
  }
}