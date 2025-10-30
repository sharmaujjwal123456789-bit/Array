// brute force approach for missing number 
// public class Arr19 {
//     public static void main(String[] args){
//         int []arr={1,2,4,5};
//         int N=5;
//         int flag;
//         for(int i=1;i<=N;i++){
//             flag=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[j]==i){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println("Missing number :"+ i);
//             }
//         }
//     }      
// } 


// advanced approach for it can say only for one missing element 
// import java.util.Scanner;
// public class Arr19{
//     public static void missnumb(int[] arr, int n){
//         int sum =n*(n+1)/2;
//         int s2=0;
//         for(int i=0;i<arr.length;i++){
//             s2 +=arr[i];
//         }
//     System.out.println("the missing numbe is "+ (sum-s2));

//     }

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
    
//         System.out.println("Enter the size of array");
//         int n= sc.nextInt();
//         int []arr=new int[n];

//         System.out.println("Enter the "+n+"Integer ");
//         for(int i=0;i<n-1;i++){
//             arr[i]=sc.nextInt();
//         }
//         missnumb(arr,n);

//     }

// }



