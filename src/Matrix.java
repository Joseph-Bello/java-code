import java.util.Arrays;

public class Matrix {
  public static void main(String[] args) {
     int[][] matrix1 = {

      {3,1,2,6,5},
      {6,2,5,6,2},
       {5,3,9,4,8},
      {1,2,4,2,7},
    };

    int[][] matrix2 =
   {
     {3,2,4,6,9},
     {2,3,5,3,6},
      {4,3,6,8,2},
      {6,7,4,5,2},
    

   };
  int[][] sumMatrix = new int [4][5];

  for (int i=0; i<4; i++){
      for (int j=0; j<5; j++){
       sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      }
  }

System.out.println("Sum of the two matrices:");
System.out.println(Arrays.deepToString(sumMatrix));
//int number [][]  = new int [4][5];
// number[0][1] = 3;
// number[1][1] = 3;
// number[0][1] = 3;
// number[0][1] = 3;
// number[0][2] = 3;
// number[0][3] = 3;
// number[1][1] = 3;
// number[1][1] = 3;
// System.out.println(Arrays.deepToString(number));
  } 
  
}