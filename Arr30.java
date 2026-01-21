//  import java.util.*;
// public class Arr30{

//      static void  Markcol(int j,int[][] arr){
//                 for(int i=0;i<arr.length;i++){
//                     if(arr[i][j] != 0){
//                         arr[i][j] = -1;
//                     }
//                 }
//             }

    
//         static void Markrow(int i, int[][] arr){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j] != 0){
//                     arr[i][j] = -1;
//                 }
//             }
//         }


//     public static int [][]Mzero(int [][]arr){

//         int m= arr.length;
//         int n= arr[0].length;

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(arr[i][j] == 0){
//                     Markrow(i , arr);
//                     Markcol(j , arr);
//                 }
//             }
//         }
    

//                 for(int i=0;i<m;i++){
//                     for(int j=0;j<n;j++){
//                         if(arr[i][j] == -1){
//                             arr[i][j] = 0;
//                         }
//                     }
//                 }

//             return arr;
//             }
//     public static void main(String []args){
//     // Scanner sc=new Scanner(System.in);
    
//     int [][]arr={
//         {1,1,1,1},
//         {1,0,0,1},
//         {1,1,0,1},
//         {1,1,1,1}
//     };
//     int [][]matrix= Mzero(arr);
    
//     for(int i =0;i< matrix.length;i++){
//         for(int j=0;j<matrix[0].length;j++){
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
//   }
// }



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


// optimal approach for the set matrix zero 

// import java.util.*;
// public class Arr30{

//     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix){
//          int n =matrix.size();
//          int m =matrix.get(0).size();

//          int col0 = 1;

//         for(int i =0 ;i<n ;i++){
//             for(int j=0 ;j<m ;j++){
//                 if(matrix.get(i).get(j) == 0){
//                     matrix.get(i).set(0, 0);

//                     if(j != 0){
//                         // matrix[0][j] =0;/
//                         matrix.get(0).set(j, 0);
//                     }else{
//                         col0 = 0;
//                     }
//                 }
//             }
//         }
//             for(int i=1 ;i < n ;i++){
//                 for(int j=1 ;j<m; j++){

//                     if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
//                         matrix.get(i).set(j, 0);
//                     }
//                 }
//             }
        
//         if(matrix.get(0).get(0) == 0){
//             for(int j=0 ;j<m ;j++){
//                 matrix.get(0).set(j, 0);
//             }
//             if(col0 == 0){
//                 for(int i=0;i<n ;i++){
//                     matrix.get(i).set(0, 0);
//                 }
//             }
//         }
//             return matrix;
//     }
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> matrix =new ArrayList<>();
//       matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
//       matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
//       matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));

//       zeroMatrix(matrix);


//       System.out.println("\nAfter");
//       for(ArrayList<Integer> row : matrix){
//         System.out.println(row);
//       }
//     }
// }