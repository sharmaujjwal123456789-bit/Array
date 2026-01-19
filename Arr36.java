// import java.util.*;
// public class Arr36 {
//     public static List<List<Integer>> triplet(int n,int[] num){
   
//         Set<List<Integer>> st= new HashSet<>();

//         for(int i=0 ; i < n ; i++){
//             for(int j=i+1 ; j<n ;j++){
//                 for(int k=j+1 ;k < n;k++){

//                     if (num[i] + num[j] + num[k] == 0){
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(num[i]);
//                         temp.add(num[j]);
//                         temp.add(num[k]);

//                         Collections.sort(temp);
//                         st.add(temp);
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
//     public static void main(String[] args){
        
//         int [] num= {-1 ,0 ,1 ,2 , -1, -4};
//         int n= num.length;

//         List<List<Integer>> ans =triplet(n, num);

//         System.out.println(ans);
//     }
    
// }

