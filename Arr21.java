// with hash map  optimal approach  (yet to be understood)
// import java.util.HashMap;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
//             if (map.containsKey(complement)) {
//                 return new int[]{map.get(complement), i};
//             }
//             map.put(nums[i], i);
//         }

//         return new int[]{}; // no pair found
//     }
// }


//    Arr 22  Sort an array of o ,1,2 Better approach

// public class Arr21{
// public static void main(String[] args){
//     int []a={0,1,2,0,1,2,1,0,0,0,1};
//     int cnt0=0;
//     int cnt1=0;
//     int cnt2=0;
//     int n=a.length;
//     for(int i=0;i<n;i++){
//         if(a[i]==0){
//             cnt0++;
//         }else if(a[i]==1){
//             cnt1++;
//         }else{
//             cnt2++;
//         }
//     }
//         for(int i=0;i<cnt0;i++){
//             a[i]=0;
//         }
//         for(int i=cnt0;i<cnt0+cnt1;i++){
//             a[i]=1;
//         }
//         for(int i=cnt0+cnt1;i<n;i++){
//             a[i]=2;
//         }
//         for(int nums : a){
//         System.out.print(nums);
//         }
// }
// }