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


//  optimal approach for it 
// import java.util.*;
// public class Arr31{
//     public static ArrayList<ArrayList<Integer>>  rotateMatrix(ArrayList<ArrayList<Integer>> mat){
//         int n =mat.size();

//         for(int i=0;i<n-1 ;i++){
//             for(int j=i+1 ;j< n;j++){
//                 // swap(mat[i][j] ,mat[j][i] );
//                 int temp = mat.get(i).get(j);
//                 mat.get(i).set(j ,mat.get(j).get(i));
//                 mat.get(j).set(i, temp);
//             }
//         }
//         for(int i =0 ;i<n;i++){
//            Collections.reverse(mat.get(i));
//         }
//         return mat;
//     }
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

//         mat.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//         mat.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
//         mat.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

//         rotateMatrix(mat);  // call function

//         System.out.println("\nRotated Matrix:");
//         for (ArrayList<Integer> row : mat) {
//             System.out.println(row);
//         }

      
//     }
// } 