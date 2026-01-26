//  brute force
// import java.util.*;
// public class Arr44 {
//     public static void MaxProduct(int []arr,int n){
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int prod =1;
//             for(int j=i;j<n;j++){
//                 prod = prod *arr[j];

//                 maxi = Math.max(maxi,prod);
//             }
//         }
//         System.out.println(maxi);
//     }
    
//     public static void main(String[] args){
//         int []arr={2,3,-2,4};
//         int n =arr.length;

//         MaxProduct(arr,n);
//     }
// }


//  optimal approach
// import java.util.*;
// public class Arr44{
//     public static void MaxProduct(int []arr,int n){
//         int pre= 1;
//         int suff=1;
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(pre == 0){
//                 pre = 1;
//             }
//             if(suff== 0){
//                 suff =1;
//             }

//             pre = pre* arr[i];
//             suff = suff*arr[n-i-1];
//             ans = Math.max(ans,Math.max(pre,suff));
//         }
//         System.out.println(ans);
//     }

//     public static void main(String[] args){
//         int []arr={2,3,-2,4};
//         int n =arr.length;

//         MaxProduct(arr,n);
//     }
// }
