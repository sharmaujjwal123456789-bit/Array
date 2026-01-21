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



import java.util.*;
public class Arr36{
    public static  ArrayList<ArrayList<Integer>> triplet(int n,ArrayList<Integer> nums){

        HashSet<ArrayList<Integer>> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums.get(i) + nums.get(j) + nums.get(k) == 0){
                          
                        ArrayList<Integer> temp = new ArrayList<>();
                       temp.add(nums.get(i));
                       temp.add(nums.get(j));
                       temp.add(nums.get(k));

                       Collections.sort(temp);
                       set.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(set);

    }
    public static void main(String[] args){

         ArrayList<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(0);
        nums.add(1);
        nums.add(2);
        nums.add(-1);
        nums.add(-4);

        int n = nums.size();

        ArrayList<ArrayList<Integer>> result = triplet(n, nums);

        System.out.println("Triplets with sum 0:");
        for (ArrayList<Integer> list : result) {
            System.out.println(list);

      }
   }

}
