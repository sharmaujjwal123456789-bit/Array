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



// import java.util.*;
// public class Arr36{
//     public static  ArrayList<ArrayList<Integer>> triplet(int n,ArrayList<Integer> nums){

//         HashSet<ArrayList<Integer>> set = new HashSet<>();

//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums.get(i) + nums.get(j) + nums.get(k) == 0){
                          
//                         ArrayList<Integer> temp = new ArrayList<>();
//                        temp.add(nums.get(i));
//                        temp.add(nums.get(j));
//                        temp.add(nums.get(k));

//                        Collections.sort(temp);
//                        set.add(temp);
//                     }
//                 }
//             }
//         }

//         return new ArrayList<>(set);

//     }
//     public static void main(String[] args){

//          ArrayList<Integer> nums = new ArrayList<>();
//         nums.add(-1);
//         nums.add(0);
//         nums.add(1);
//         nums.add(2);
//         nums.add(-1);
//         nums.add(-4);

//         int n = nums.size();

//         ArrayList<ArrayList<Integer>> result = triplet(n, nums);

//         System.out.println("Triplets with sum 0:");
//         for (ArrayList<Integer> list : result) {
//             System.out.println(list);

//       }
//    }

// }


// import java.util.*;
// public class Arr36{
// public static ArrayList<ArrayList<Integer>> triplet(int n,ArrayList<Integer> nums){
         
//     HashSet<ArrayList<Integer>> set = new HashSet<>();

//     for(int i=0;i<n;i++){
//         HashSet<Integer> hashset = new HashSet<>();

//         for(int j=0;j<n;j++){

//             int third = -(nums.get(i) + nums.get(j));

//             if(hashset.contains(third)){
                
//                 ArrayList<Integer> temp= new ArrayList<>();

//                 temp.add(nums.get(i));
//                 temp.add(nums.get(j));
//                 temp.add(third);

//                 Collections.sort(temp);

//                 set.add(temp);
//             }

//             hashset.add(nums.get(j));
//         }
//     }

//     return new ArrayList<>(set);
// }

//     public static void main(String []args){
//         Scanner sc= new Scanner(System.in);

//         System.out.println("enter number of element");
//         int n = sc.nextInt();

//         ArrayList<Integer> nums= new ArrayList<>();


//         for(int i=0;i<n;i++){
//             nums.add(sc.nextInt());
//         }

//         ArrayList<ArrayList<Integer>> result = triplet(n, nums);


//         System.out.println("triplet with sum 0");
//         for(ArrayList<Integer> list : result){
//             System.out.println(list);
//         }
//     }
// }

  


// optimal approach  error in it 

// import java.util.*;

// public class Arr36{

//     public static void main(String []args){

//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

//         Collections.sort(nums);

//         for(int i=0;i<n;i++){

//             if(i>0 && nums.get(i).equals(nums.get(i-1)))
//             continue;

//             int j= i+1;
//             int k= n-1;

//             while(j < k){
//                 int sum = nums.get(i) + nums.get(j)+ nums.get(k);

                
//                 if (sum < 0) {
//                     j++;
//                 }
//                 else if (sum > 0) {
//                     k--;
//                 }
//                 else {
//                     ArrayList<Integer> temp = new ArrayList<>();
//                     temp.add(nums.get(i));
//                     temp.add(nums.get(j));
//                     temp.add(nums.get(k));

//                     ans.add(temp);

//                     j++;
//                     k--;

//                     // skip duplicate j
//                     while (j < k && nums.get(j).equals(nums.get(j - 1))) {
//                         j++;
//                     }

//                     // skip duplicate k
//                     while (j < k && nums.get(k).equals(nums.get(k + 1))) {
//                         k--;
//                     }
//                 }
//             }
//         }

//         return ans;
//     }
    


//     public static void main(String []args){

//         Scanner sc =new Scanner(System.in);

//         System.out.println("Enter number of elements :");

//         int n =sc.nextInt();

//         ArrayList<Integer> nums=new ArrayList<>();

//         System.out.println("Enter the elemnets");
//         for(int i=0;i<n;i++){
//             nums.add(sc.nextInt());
//         }

//         ArrayList<ArrayList<Integer>> result = triplet(n,nums);

//         System.out.println("triplet with sum 0 :");

//         for(ArrayList<Integer> list : result){
//             System.out.println(list);
//         }
//     }
// }



//  optimal approach
// import java.util.*;

// public class Arr36 {

//     public static ArrayList<ArrayList<Integer>> triplet(int n, ArrayList<Integer> nums) {

//         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

//         // sort the array
//         Collections.sort(nums);

//         for (int i = 0; i < n; i++) {

//             // skip duplicate i
//             if (i > 0 && nums.get(i).equals(nums.get(i - 1)))
//                 continue;

//             int j = i + 1;
//             int k = n - 1;

//             while (j < k) {

//                 int sum = nums.get(i) + nums.get(j) + nums.get(k);

//                 if (sum < 0) {
//                     j++;
//                 }
//                 else if (sum > 0) {
//                     k--;
//                 }
//                 else {
//                     ArrayList<Integer> temp = new ArrayList<>();
//                     temp.add(nums.get(i));
//                     temp.add(nums.get(j));
//                     temp.add(nums.get(k));

//                     ans.add(temp);

//                     j++;
//                     k--;

//                     // skip duplicate j
//                     while (j < k && nums.get(j).equals(nums.get(j - 1))) {
//                         j++;
//                     }

//                     // skip duplicate k
//                     while (j < k && nums.get(k).equals(nums.get(k + 1))) {
//                         k--;
//                     }
//                 }
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of elements: ");
//         int n = sc.nextInt();

//         ArrayList<Integer> nums = new ArrayList<>();

//         System.out.println("Enter elements:");
//         for (int i = 0; i < n; i++) {
//             nums.add(sc.nextInt());
//         }

//         ArrayList<ArrayList<Integer>> result = triplet(n, nums);

//         System.out.println("Triplets with sum 0:");
//         for (ArrayList<Integer> list : result) {
//             System.out.println(list);
//         }
//     }
// }

