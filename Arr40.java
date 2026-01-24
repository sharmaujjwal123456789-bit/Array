//  brute force 
// import java.util.*;
// public class Arr40 {
//     public static void merge(int []arr1,int []arr2,int n,int m){
//         int []arr3= new int[n+m];
//         int left =0;
//         int right=0;
//         int index=0;

//         while(left < n && right < m){
//             if(arr1[left] <= arr2[right]){
//                 arr3[index] =arr1[left];
//                 left++; 
//                 index++;
//             }else{
//                 arr3[index] = arr2[right];
//                 right++;
//                 index++;
//             }
//         }

//         while(left < n){
//             arr3[index++] = arr1[left++];
//         }

//         while(right < m){
//             arr3[index++] = arr2[right++];
//         }

//         for(int i=0;i<n+m;i++){
//             if(i<n){
//                 arr1[i] =arr3[i];
//             }else{
//                 arr2[i-n] = arr3[i];
//             }
//         }
        
//         for(int num : arr1){
//             System.out.print(num);
//         }
//         System.out.println();
//         for(int nums : arr2){
//             System.out.print(nums);
//         }
//     }
    
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
        
//         System.out.println("Eneter the size of 1st array");
//         int n = sc.nextInt();

//         System.out.println("Enter the element of 1st array");
//         int []arr1=new int[n];

//         for(int i=0;i<n;i++){
//            arr1[i]=sc.nextInt();
//         }


//         System.out.println("Enter the size of 2nd array");
//         int m = sc.nextInt();

//         System.out.println("Eneter the element of second array");
//         int []arr2=new int[m];
//         for(int i=0;i<m;i++){
//             arr2[i] = sc.nextInt();
//         }

//         merge(arr1,arr2,n,m);
//     }
// }

//  better approach
import java.util.*;
