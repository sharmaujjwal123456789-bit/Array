//  brute force for rotate matrix
// import java.util.*;
// public class Arr31 {
//     public static int[][] rotate(int[][] matrix){
//      int n =matrix.length;
//      int[][] rotated = new int[n][n];

//      for(int i=0;i<n;i++){
//         for(int j=0;j < n;j++){
//             rotated[j][n-i-1] = matrix[i][j];
//         }
//      }
//      return rotated;
//     }
//     public static void main(String[] args){
//    int[][] matrix ={
//     {1,2,3},
//     {4,5,6},
//     {7,8,9},
//    };
//    int [][] result =rotate(matrix);

//    System.out.println("Rotated Matrix :");
//    for(int i=0 ;i < result.length ;i++){
//     System.out.println(Arrays.toString(result[i]));
//      }
//    } 
// }
