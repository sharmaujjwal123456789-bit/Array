//  better approach for set matrix zero using dynamic array
// import java.util.*;
// public class Arr30 {
//     public static void zeroMatrix(ArrayList<ArrayList<Integer>> matrix){
//         int n = matrix.size();   // number of rows
//         int m = matrix.get(0).size();   // number of columns

//         int []row = new int[n];
//         int []col = new int[m];


//       for(int i=0;i<n;i++){
//         for(int j=0; j<m;j++){
//             if(matrix.get(i).get(j) == 0){
//                 row[i] = 1;
//                 col[j] = 1;
//             }
//         }
//       }
//       for(int i=0; i<n; i++){
//         for(int j=0; j<m; j++){
//             if(row[i]  == 1 || row[j] == 1){
//                 matrix.get(i).set(j ,0);
//             }
//         }
//       }
//     }

//     public static void main(String[] args){
//     ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
//     matrix.add(new ArrayList<>(Arrays.asList(1,2,3)));
//     matrix.add(new ArrayList<>(Arrays.asList(4,0,6)));
//     matrix.add(new ArrayList<>(Arrays.asList(7,8,9)));
   
//     zeroMatrix(matrix);

//     for(ArrayList<Integer> row : matrix){
//         System.out.println(row);
//      }
//    }
// }


//  using without the dynamic aaray

// import java.util.*;
// public class Arr30{
//     public static void zeroMatrix(int [][] matrix){
//         int n =matrix.length;  // for rows
//         int m = matrix[0].length;  // for columns
        
//         int []row = new int[n];
//         int []col = new int[m];


//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j] == 0){
//                     row[i] =1;
//                     col[j] =1;
//                 }
//             }
//         }

//         for(int i=0; i<n;i++){
//             for(int j=0; j<m ;j++){
//                 if(row[i] == 1  || col[j] ==1){
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//   public static void main(String[] args){
//  int [][] matrix= {
//      {1,2,3},
//      {4,0,5},
//      {6,7,8},
//  };

//    zeroMatrix(matrix);
//    for(int i=0;i<matrix.length ;i++){
//     System.out.println(Arrays.toString(matrix[i]));
//    }
//     }
// }
