// //  brute force

// import java.util.*;
// public class Arr39 {

//     public static ArrayList<ArrayList<Integer>> mergeOverlap(ArrayList<ArrayList<Integer>> arr){

//         int n = arr.size();

//         Collections.sort(arr, (a, b) -> a.get(0) - b.get(0));

//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             int start = arr.get(i).get(0); // it means gets first element of that inner list [1,3].get(0) = 1
//             int end = arr.get(i).get(1); // it means get second element [1,3].get(1) = 3

//             if(!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)){
//                 continue;
//             }

//             for(int j= i+1 ;j<n ; j++){
//                 if(arr.get(j).get(0) <= end){
//                     end = Math.max(end, arr.get(j).get(1));
//                 }else{
//                     break;
//                 }
//             }

//             ArrayList<Integer> temp = new ArrayList<>();
//             temp.add(start);
//             temp.add(end);

//             ans.add(temp);
//         }

//         return ans;
//     }
    
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

//         arr.add(new ArrayList<>(Arrays.asList(1,3)));
//         arr.add(new ArrayList<>(Arrays.asList(2,4)));
//         arr.add(new ArrayList<>(Arrays.asList(3,5)));
//         arr.add(new ArrayList<>(Arrays.asList(6,7)));

//         System.out.println(mergeOverlap(arr));
//     }

// }



//  optimal approach

import java.util.*;
public class Arr39{
    public static ArrayList<ArrayList<Integer>> mergeOverlap(ArrayList<ArrayList<Integer>> arr){
        // int n = arr.size();

        Collections.sort(arr, (a,b) -> a.get(0) - b.get(0));

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();

        for(int i=0;i<arr.size();i++){
            
            if(ans.isEmpty() || arr.get(i).get(0) > ans.get(ans.size() - 1).get(1)){
                ans.add(arr.get(i));
            }else{
                int lastEnd = ans.get(ans.size()-1).get(1);
                int currEnd = arr.get(i).get(1);

                ans.get(ans.size() - 1).set(1 , Math.max(lastEnd,currEnd));
            }
        }
        return ans;
    }

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();

        arr.add(new ArrayList<>(Arrays.asList(1,3)));
        arr.add(new ArrayList<>(Arrays.asList(2,4)));
        arr.add(new ArrayList<>(Arrays.asList(3,5)));
        arr.add(new ArrayList<>(Arrays.asList(6,7)));

        System.out.println(mergeOverlap(arr));
    }
}