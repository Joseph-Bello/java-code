public class LoopedStructure {
    public static void main(String [] args){
         int sum = 0;
         long product = 1; 
 
        //  for (int i = 1; i <= 1000; i++) {
        //      if (i % 2 != 0) {
        //          sum += i;
        //          product *= i;
        //      }
        //  }
        int i=1;
        while(i< 1000){
            sum = sum + i;
            product = product * i;
            i+= 2;
        }
         System.out.println("\nSum of odd numbers: " + sum);
 
        
         System.out.println("Product of odd numbers: " + product);
    }
 }
 