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
// import java.util.*;
// public class Arr40{
//     public static void merge(int []arr1,int []arr2,int n,int m){
//         int left=n-1;
//         int right=0;

//         while(left >= 0 && right< m){
//                 int temp =0;
//             if(arr1[left] > arr2[right]){
//                 temp = arr1[left];
//                 arr1[left]=arr2[right];
//                 arr2[right]=temp;
//                 left--;right++;
//             }else{
//                 break;
//             }
//         }
//         // Collections.sort(arr1); it works only for the list
//         // Collections.sort(arr2);
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         for(int num : arr1){
//             System.out.print(num);
//         }
//         System.out.println();
//         for(int nums: arr2){
//             System.out.print(nums);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("eneter the size of array");
//         int n = sc.nextInt();
//         System.out.println("Enter the array element");
//         int []arr1=new int[n];
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         System.out.println("Eneter the array size pf 2 array");
//         int m = sc.nextInt();
//         System.out.println("Enter the array element");
//         int []arr2=new int[m];
//         for(int i=0;i<m;i++){
//             arr2[i]=sc.nextInt();
//         }
//         merge(arr1,arr2,n,m);
//     }
// }

//  another optimal approach
// import java.util.*;
// public class Arr40{
//     public static void swapIfGreater(int []arr1,int []arr2,int ind1,int ind2){
        
//         if(arr1[ind1] > arr2[ind2]){
//             int temp = arr1[ind1];
//              arr1[ind1] =arr2[ind2];
//              arr2[ind2]= temp;
//         }
//     }
//     public static void merge(int []arr1,int []arr2,int n,int m){
//         int len = (n+m);
//         int gap = (len / 2) + (len % 2);

        
//             while(gap>0){
//                 int left=0;
//                 int right =left+ gap;

//                 while(right< len){
//                //arr1 and arr2
//                if( left < n && right >= n){
//                 swapIfGreater(arr1, arr2, left, right-n);
//                }
//                // arr2 and arr2
//                else if(left >= n){
//                 swapIfGreater(arr2,arr2,left-n,right-n);
//                }
//                else{
//                 swapIfGreater(arr1,arr1,left,right);
//                }
//                left++;
//                right++;

//                 }
//                 if(gap==1)break;
//                 gap = (gap/2) + (gap % 2);
//             }
//              for(int num : arr1){
//             System.out.print(num);
//         }
//         System.out.println();
//         for(int nums: arr2){
//             System.out.print(nums);
//         }  
//     } 
    
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("eneter the size of array");
//         int n = sc.nextInt();
//         System.out.println("Enter the array element");
//         int []arr1=new int[n];
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         System.out.println("Eneter the array size pf 2 array");
//         int m = sc.nextInt();
//         System.out.println("Enter the array element");
//         int []arr2=new int[m];
//         for(int i=0;i<m;i++){
//             arr2[i]=sc.nextInt();
//         }
//         merge(arr1,arr2,n,m);
//     }
//     }
