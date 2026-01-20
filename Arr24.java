//  Maximum subarray sum 

//  brute force o(n3) tc
// public class Arr24 {
//     public static void main(String[] args){
//         int []arr={-2,-3,4,-1,-2,1,5,-3};
//         int n=arr.length;   
//         int maxi= Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++){
//             for(int j=i;j<n;j++){
//                int sum =0;
//                 for(int k=i;k <= j;k++){
//                     sum+=arr[k];
//                 }
//                     maxi=Math.max(maxi, sum);
//             }
//         }
//         System.out.print("maximum subarray sum =" + maxi);
//     }
// }


//  optimal approach for the maximum subarray printing the max sum through it 

// public class Arr24{
//     public static void main(String[] args){

//         int []arr={-2,-3,4,-2,8,-4,3};
//         int sum=0;
//         int maxi= Integer.MIN_VALUE;

//         for(int i=0;i<arr.length;i++){
//             sum +=arr[i];

//          if(sum > maxi){
//             maxi = sum;
//          }

//          if(sum < 0){
//             sum = 0;
//          }
//         }

//         System.out.print("Maximum subarray sum is"+ maxi);
//     }
// }

//  optimal approach for printing the maxsum subarray

//   public class Arr24{
//     public static void main(String[] args){

//         int []arr={-2,-3,4,-2,8,-4,3};
//         int sum=0;
//         int maxi= Integer.MIN_VALUE;
//         int start=0;
//         int anstrt=-1;
//         int ansEnd=-1;

//         for(int i=0;i<arr.length;i++){
//             if(sum == 0){
//                 start = i;
//             }
//             sum +=arr[i];

//          if(sum > maxi){
//             maxi = sum;
//             anstrt = start ;
//              ansEnd = i;
//          }

//          if(sum < 0){
//             sum = 0;
//          }
//         }

//         System.out.println("Maximum subarray is"+ maxi);
//         for(int i=anstrt;i<=ansEnd;i++){
//             System.out.print(arr[i] +" ");
//         }

//     }
// }



// best time to buy sell stock question(arr 25)

// public class Arr24{
//     public static void main(String[] args){
//         int []price={3,2,1,5,6,2};

//         int mini=price[0];
//         int maxProfit=0;
//         int n=price.length;

//         for(int i=0;i<n;i++){
//             int cost=price[i] -mini;
//             maxProfit =Math.max(maxProfit, cost);
//             mini=Math.min(mini,price[i]);
//         }
//         System.out.print("Maximum profit is"+ maxProfit);
//     }
// }