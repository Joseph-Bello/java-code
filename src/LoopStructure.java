public class LoopStructure{
  public static void main (String [] args ){
    int sum = 0;
    int product = 1;

//for loop

    //for (int i=1; i<=1000; i+= 2){
     // System.out.print(i + " ");
      //sum += i;
      //product *= i; 
    //}

    int i=1;

//while loop

     while (i<=1000)
    
     {
      System.out.print(i + " ");
      sum += i;
      product *= i; 
      i+= 2;
    }

    System.out.println("Sum of odd numbers " + sum);
    System.out.println("products of odd numbers " + product);

  }
}
   