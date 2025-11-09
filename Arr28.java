// import java.util.*;
// public class Arr28 {
//     public static ArrayList<Integer> superior(ArrayList<Integer> a){
//         ArrayList<Integer> ans=new ArrayList<>();
//         int maxi= Integer.MIN_VALUE;
//         int n =a.size();

//         for(int i=n-1 ; i>=0 ;i--){
//             if(a.get(i) > maxi){
//                 ans.add(a.get(i));
//             }
//             maxi =Math.max(maxi, a.get(i));   //  updating the maxi for next iteration 
//         }
//         Collections.reverse(ans);  // functon to reveerse the result
//         return ans;
//     }
//    public static void main(String[] args){
//      ArrayList<Integer> a=new ArrayList<>(Arrays.asList(10,22,12,3,0,6));

//      ArrayList<Integer> result=superior(a);
//      System.out.println("Superior Element" + result);
//    }  
// }


//  Arr 29  Longest consecutive sequence 

//  brute force 
// import java.util.*;
// public class Arr28{
//     public static void main(String []args){
//         int []arr={102,4,100,1,101,3,2,1,1,};
//         System.out.println("Longest consecutive sequence length" +LongestConsecutive(arr));
//     }
  
//     static int LongestConsecutive(int[] arr){
//         int n= arr.length;
//         int longest=1;

//         for(int i=0;i<n;i++){
//             int x= arr[i];
//             int count =1;

//             while(ls(arr, x+1) == true){
//                 x= x+1;
//                 count++;
//             }
//             longest= Math.max(longest ,count);
//         }
//         return longest;
//     }

//     static boolean ls(int[] arr, int num){
//         for(int val: arr){
//             if(val == num){
//                 return true;
//             }
//         }
//             return false;   
//     }
// }


//  better approach 
// import java.util.*;
// public class Arr28{
// public static int LargestElements(ArrayList<Integer> nums){
  
//      Collections.sort(nums);

//      int n= nums.size();
//      int lastSmaller= Integer.MIN_VALUE;
//      int cnt = 0;
//      int longest =1;
//      for(int i=0;i<n;i++){
//         if(nums.get(i) - 1 == lastSmaller){
//             cnt++;
//             lastSmaller =nums.get(i);
//         }
//         else if(lastSmaller != nums.get(i)){
//             cnt =1;
//             lastSmaller =nums.get(i);
//         }
//         longest =Math.max(longest , cnt);
//      }
//      return longest;
// }

// public static void main(String[] args){
//     ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(102,4,5,100,3,2,1,1));
//     System.out.println("Longest consecutive sequence length " + LargestElements(nums));
// }
// }



// optimal approach

// import java.util.*;

// public class Arr28{
//     public static int longestElements(ArrayList<Integer> a){
//         int n= a.size();
//         if(n==0) return 0;

//         int longest =1;

//         HashSet<Integer> st = new HashSet<>();
//         for(int num: a){
//             st.add(num);
//         }

//         for (int it : st){
//             if(!st.contains(it - 1)){
//                 int cnt =1;
//                 int x= it;

//                 while(st.contains(x + 1)){
//                     x = x+1;
//                     cnt++;
//                 }

//                 longest = Math.max(longest , cnt);
//             }
//         }
//         return longest;
//     }
    
//     public static void main(String[] args){
//         ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(102,4,100,1,101,3,2,1,1));
//         System.out.println("Longest consecutive length "+ longestElements(nums));
//     }
// }