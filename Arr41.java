// brute force 
// import java.util.*;
// public class Arr41 {
//     public static void missing(int[] arr,int n){

//         int missing = -1;
//         int repeating = -1;

//         for(int i=1;i<=n;i++){
//             int cnt=0;
//             for(int j=0;j<n;j++){
//                 if(arr[j] == i){
//                     cnt++;
//                 }
//             }

//             if(cnt == 2){
//               repeating = i;
//             }else if(cnt==0){
//                 missing = i;
//             }
//             if(repeating != -1  && missing != -1){
//                 break;
//             }
//         }
//         System.out.println("Repeating =" + repeating);
//         System.out.println("Missing =" + missing);
//     }
//     public static void main(String []args){
//      int []arr={4,3,6,2,1,1};
     
//      int n= arr.length;

//      missing(arr,n);
//     }
// }


//  better approach

// import java.util.*;
// public class Arr41{ 
//     public static void missing(int []arr1,int n){

//         int []hash= new int[n+1];
//         for(int i=0;i<n;i++){
//             hash[arr1[i]]++;
//         }
//         int repeating=-1;
//         int missing =-1;
//         for(int i=1;i<=n;i++){
//             if(hash[i] == 2){
//                 repeating = i;
//             }else if(hash[i] == 0){
//                 missing = i;
//             }

//             if(repeating != -1 && missing != -1){
//                 break;
//             }
//         }
//         System.out.println("repeating "+ repeating + " misssing"+missing);
//     }
//     public static void main(String[] args){
//         int []arr1= {4,3,6,2,1,1};

//         int n= arr1.length;
//         missing(arr1,n);
//     }
// }


// optimal approach
// import java.util.*; 
// public class Arr41{
//     public static void missing(int[] arr,int n){
//         long Sn= (n * (n+1)) / 2;
//         long Sn2= (n * (n+1) * (2*n+1)) /6;
//         long S= 0;
//         long S2 = 0;
//         for(int i=0;i<n;i++){
//             S += arr[i];
//             S2 += (long)arr[i] * arr[i];
//     }

//     long val1 = S - Sn;// x-y
//     long val2 = S2 - Sn2;// x^2  - y^2

//     val2 = val2 / val1;

//     long x= (val1 + val2) /2;
//     long y = x - val1;
//     System.out.println(x);
//     System.out.println(y);
//     }

//     public static void main(String[] args){
     
//         int []arr={4,3,6,2,1,1};
//         int n = arr.length;

//         missing(arr,n);
//     }
// }
