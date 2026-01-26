//  brute force 
// import java.util.*;
// public class Arr42 {
//     public static void inversion(int []arr,int n){
//         int cnt =0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//            if(arr[i] > arr[j]){
//             cnt++;
//            }
//         }
//     }
//         System.out.println(cnt);
//     }
  
//     public static void main(String[] args){
//         int []arr={5,3,2,4,1};

//         int n= arr.length;
//         inversion(arr,n);
//     }
// }


// optimal approach
// import java.util.*;
// public class Arr42{
//     public static void merge(int []arr,int low,int mid,int high){
//         ArrayList<Integer> temp = new ArrayList<>();
//         int left = low;
//         int right = mid+1;
//         int cnt = 0;

//         while( left <= mid && right <= high){
//             if(arr[left] <= arr[right]){
//                 temp.add(arr[left]);
//                 left++;
//             }else{
//                temp.add(arr[right]);
//                cnt += (mid -left +1);
//                right++;
//             }
//         }
//         while(left <= mid){
//             temp.add(arr[left]);
//             left++;
//         }
//         while(right<= high){
//             temp.add(arr[right]);
//             right++;
//         }

//         for(int i=0 ;i< temp.size() ;i++){
//             arr[low+i] = temp.get(i);
//         }
//     }

//     //  mergeg sort function
//     public stati void mS(int[] arr, int low,int high){
//         int cnt =0;
//         if(low >= high)
//         return;
//         int mid = (low+high ) / 2;
//         cnt +=mS(arr,low,mid);
//         cnt += mS(arr,mid+1,high);
//         cnt +=merge(arr,low,mid,high);
//         return cnt;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the no. of element");
//         int n = sc.nextInt();

//         int []arr= new int[n];

//         System.out.println("Eneter the " + n+ "Element to be inserted");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Original array");
//         for(int x : arr){
//             System.out.print(x + " ");
//         }
//         System.out.println();

//         mS(arr , 0 ,n-1);

//         System.out.println("Sorted array");
//         for(int x: arr){
//             System.out.print(x + " ");
//         }
//     }
// }
