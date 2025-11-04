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


 // longest subarray with sum k

    // import java.util.ArrayList;
    // import java.util.Scanner;
    // public class Arr19{
    // public static int LongestSubArraywithSum(ArrayList<Integer> arr,int n,long k){
    //     int left=0;
    //     int right=0;
    //     long sum=arr.get(0);
    //     int maxLen=0;
    //     while(right<n){
    //         while(left <= right && sum>k){
    //             sum -= arr.get(left);
    //             left++;
    //         }
    //         if(sum == k){
    //             maxLen = Math.max(maxLen, right -left +1);
    //         }
    //         right++;
    //         if(right < n){
    //             sum +=arr.get(right);
    //         }
    //     }
    //         return maxLen;
    // }
    //     public static void main(String[] args){
    //         Scanner sc=new Scanner(System.in);
    //         System.out.println("Enter the size of array");
    //         int n=sc.nextInt();
    //         ArrayList<Integer> arr=new ArrayList<>();


    //         System.out.println("Enter the integer ");
    //         for(int i=0;i<n;i++){
    //           arr.add(sc.nextInt());
    //         }

    //         System.out.println("Enter the sum for the aaray");
    //         long k =sc.nextInt();

    //         int result=LongestSubArraywithSum(arr,n,k);
    //         System.out.println(result);
    //     }
    // }



    //  it works for negative also not understandable by me at later
import java.util.*;

public class Arr19 {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            // Case 1: subarray from index 0 to i
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            long rem = sum - k;

            // Case 2: subarray from previous sum to current index
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Store first occurrence of sum
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        long k = 8;
        System.out.println(longestSubarrayWithSumK(arr, k)); // Example output
    }
}


