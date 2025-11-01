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

//  maximum consecutive no. in the array
// import java.util.Scanner;
// public class Arr19{
//     public static void Maxconsecutive(int []nums){
//         int maxi=0;
//         int cnt=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] == 1){
//                 cnt++;
//                 maxi =Math.max(maxi,cnt);
//             }
//             else{
//                 cnt=0;
//             }
//         }
//         System.out.println("The max no. is "+maxi);
//     }
//     public static void main(String[]args){
     
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []nums=new int[n];

//         System.out.println("Enter the "+n+"elements");
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         Maxconsecutive(nums);
//     }
// }


//  finsd the number that appear once and the other twice 
//  brute force approach 
// import java.util.Scanner;
// public class Arr19{

//     public static void nonrep(int []arr, int n){
//         int cnt;
//         int num;
//        for(int i=0;i<arr.length;i++){
//         num=arr[i];
//         cnt=0;
        
//         for(int j=0;j<arr.length;j++){
//             if(arr[j]==num){
//                 cnt++;
//             }
//         }
//          if(cnt==1){
//                 System.out.println("the non repeating no. is "+num);
//             }
//        }    
//     }
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);
//         int n= sc.nextInt();

//         int []arr=new int[n];
//         System.out.println("Eneter the"+n+"integer ");

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         nonrep(arr,n);
//     }
// }

//  optimal approach for number that appear once 
// import java.util.Scanner;
// public class Arr19{
//     public static void getSingle(int []arr,int n){
//         int xor=0;
//         for(int i=0;i<arr.length;i++){
//             xor=xor^arr[i];
//         }
//         System.out.println(xor);
//     }
//     public static void main(String[] args){
//   Scanner sc= new Scanner(System.in);
//   int n =sc.nextInt();
//   int []arr=new int[n];

//   System.out.println("Enter the"+n+"Integer ");
//   for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//   }
//   getSingle(arr,n);
//     }
// }

//  better epproach for single element
// import java.util.Scanner;
// public class Arr19{
//     public static int getsingle(int[] arr,int n){
//         int maxi=arr[0];
//         for(int i=1;i<arr.length;i++){
//             maxi=Math.max(maxi,arr[i]);
//         }

//         int[]hash=new int[maxi + 1];

//         for(int i=0;i<n;i++){
//             hash[arr[i]]++;
//         }

//         for(int i=0;i<n;i++){
//          if(hash[arr[i]] == 1){
//             return arr[i];
//          }
//         }
//         return -1;
//     }

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);

//         int n=sc.nextInt();
//         int []arr=new int[n];
//         System.out.println("Enter the  integer");

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int result=getsingle(arr,n);
//         System.out.println("the single element is"+ result);
//     }
// }