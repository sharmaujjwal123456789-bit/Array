// // better approach
// // package Array;
// import java.util.Scanner;

// public class Arr17 {
//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the no. of Element");
//         int n =sc.nextInt();
//          System.out.println("Enter the "+n+"of Element");
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int largest= arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>largest){
//                 largest =arr[i];
//             }
//         }
        
//          System.out.print("The largest element is"+largest);
//         // return largest;
//     }
// }


// optimal approach

// import java.util.Scanner;

// public class Arr17 {
//     public static int SecondLargest(int[] arr,int n){
//         int largest=arr[0];
//         int slargest=-1;
//         for(int i=1;i<n;i++){
//             if(arr[i]>largest){
//                 slargest=largest;
//                 largest=arr[i];
//             }else if(arr[i]<largest && arr[i]>slargest){
//                slargest =arr[i];
//             }
//         }
//         System.out.println("The largest is "+largest+"second largest is "+slargest);
//         return slargest;
//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no. of element");
//         int n= sc.nextInt();

//         int []arr=new int[n];
//         System.out.print("Enter teh element of array");
//         for(int i=0;i<n;i++){
//           arr[i]=sc.nextInt();
//         }
//         SecondLargest(arr,n);

//     }
// }


//  finding duplicate in an array in sorted

// import java.util.Scanner;
// public class Arr17 {
//       public static int duplicate(int[] arr,int n){
//         int i=0;
//         for(int j=1;j<n;j++){
//             if(arr[i] != arr[j]){
//                 arr[i+1]=arr[j];
//                 i++;
//             }
//         }
//         return i+1;
//       }

//  public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the no. of element");
//         int n= sc.nextInt();

//         int []arr=new int[n];
//         System.out.print("Enter teh element of array");
//         for(int i=0;i<n;i++){
//           arr[i]=sc.nextInt();
//         }
//           int newLength = duplicate(arr, n);
//         System.out.println("Array after removing duplicates:");
//         for (int i = 0; i < newLength; i++) {
//             System.out.print(arr[i] +" ");
//         }
//         System.out.println();
// }
// }



//  leetcode problem 
// class Solution {
//     public int[] twoSum(int[] arr, int target) {
        
        
//         int i=0;
//         int j=i+1;
//         for(;i<arr.length-1;){
//             if(arr[i] +arr[j]==target){
//                 return new int[]{i,j};
//             }
//             j++;
//             if(j == arr.length){
//                 i++;
//                 j=i+1;
//             }
//         }
//         return new int[]{};

//     }
// }