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
//             maxi =Math.max(maxi, a.get(i));
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


