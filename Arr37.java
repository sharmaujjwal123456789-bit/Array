// brute force 
// import  java.util.*;
// public class Arr37 {
//     public static List<List<Integer>> fourSum(int n,int []nums,int target){
//     // int n=nums.length;
//     Set<List<Integer>> st =new HashSet<>();

//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//                 for(int l=k+1;l<n;l++){

//                     // long sum =(long)nums[i] + nums[j] +nums[k] +nums[l];
//                     if( nums[i] + nums[j] +nums[k] +nums[l]== target){
//                         List<Integer> temp=new ArrayList<>();
//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         temp.add(nums[l]);

//                         Collections.sort(temp);
//                         st.add(temp);
//                     }
//                 }
//             }
//         }
//     }
//     return new ArrayList<>(st);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the sum equals to k");
//         int target=sc.nextInt();

//         int []nums={-1,0,1,2,-1,-4,1,-2};

//         int n=nums.length;

//         List<List<Integer>> ans=fourSum(n,nums,target);

//         System.out.print(ans);
//     }
    
// }



// better approach
//  import java.util.*;
//  public class Arr37{
//     public static ArrayList<ArrayList<Integer>> fourSum(int []nums,int target,int n){
//         HashSet<ArrayList<Integer>> st = new HashSet<>();

//         for(int i=0;i<n;i++){ 
//             for(int j=i+1;j<n;j++){
//                 HashSet<Integer> hashset=new HashSet<>();

//                 for(int k=j+1;k<n;k++){
//                     long sum = nums[i]+nums[j]+nums[k];
//                     long fourth =target - sum;


//                     //  just converting the long into the int 
//                     if (hashset.contains((int) fourth)){
//                         ArrayList<Integer> temp = new ArrayList<>();

//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         temp.add((int)fourth);

//                         Collections.sort(temp);
//                         st.add(temp);
//                     }
//                     hashset.add(nums[k]);
//                 }
//             }
//         }
//         return new ArrayList<>(st);
//     }
//     public static void main(String []args){
//         Scanner sc= new Scanner(System.in);

//         System.out.println("Eneter the target to be find in array");
//         int target = sc.nextInt();

//         int []nums={-1,0,1,2,-1,-4,1,-2};
//         int n= nums.length;

//         ArrayList<ArrayList<Integer>> ans=fourSum(nums,target,n);

//         System.out.println(ans);
//     }
//  }



//  optimal approach

import java.util.*;
public class Arr37{

    public static ArrayList<ArrayList<Integer>>  fourSum(ArrayList<Integer> nums, int target , int n){
        Collections.sort(nums);

        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i>0 && nums.get(i).equals(nums.get(i-1)))
            continue;

            for(int j=i+1; j<n; j++){
                if(j>i+1 && nums.get(j).equals(nums.get(j-1)))
                continue;
                int k= j + 1;
                int l= n - 1;

                while( k<l ){
                    long sum= nums.get(i) + nums.get(j) + nums.get(k) +nums.get(l);
                    
                    if(sum == target ){
                        ArrayList<Integer> temp = new ArrayList<>();

                        temp.add(nums.get(i));
                        temp.add(nums.get(j));
                        temp.add(nums.get(k));
                        temp.add(nums.get(l));
                        ans.add(temp);

                        l--;
                        k++;

                        while(k<l && nums.get(k).equals(nums.get(k-1))){
                            k++;
                        }

                        while(k<l && nums.get(l).equals(nums.get(l+1))){
                            l--;
                        }
                    }
                    else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter the sum to be found in the array");
        int target=sc.nextInt();

        System.out.println("Enter the  array size");
        int n =sc.nextInt();

        ArrayList<Integer> nums= new ArrayList<>();
        System.out.println("Enter the element of  the array");

        for(int i=0;i<n;i++){
            nums.add(sc.nextInt());
        }

        ArrayList<ArrayList<Integer>> result= fourSum(nums,target,n);

        for( ArrayList<Integer> list : result){
            System.out.println(list);
        }
    }
}