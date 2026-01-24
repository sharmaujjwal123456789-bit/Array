

//  bettter approach
// import java.util.*;
// public  class Arr38 {
//     public static int subArray(int []nums,int n,int target){
//         int cnt=0;
//         for(int i=0;i<n;i++){
//             int xor=0;
//             for(int j=i;j<n;j++){
//                 xor=xor^nums[j];

//                 if(xor == target){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
    
//   public static void main(String []args){
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter the sum of array  to be founded");
 
//      int target =sc.nextInt();

//     int [] nums= {4,2,2,6,4};
//     int n =nums.length;

//     int result = subArray(nums,n,target);

//    System.out.println(result);

//   }
// }


//  optimal approach
import java.util.*;
public class Arr38{

    public static int subArrayWithSumK(int[] a, int k){
        int xr = 0;
        HashMap<Integer , Integer> mp= new HashMap<>();

        mp.put(0,1);

        int cnt=0;

        for(int i=0;i<a.length;i++){
            xr = xr^a[i];

            int x= xr ^ k;

            cnt += mp.getOrDefault(x,0);

            mp.put(xr,mp.getOrDefault(xr,0) + 1);
        }
        return cnt;
    } 

    public static void main(String[] args){
        int [] arr= {4,2,2,6,4};
        int k=6;

        System.out.println(subArrayWithSumK(arr,k));
    }
}

 