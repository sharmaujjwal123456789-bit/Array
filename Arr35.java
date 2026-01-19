//  brute force  code to find element in array which are repeated more than n/3 times
// import java.util.*;
// public class Arr35 {
//     public static ArrayList<Integer> repeatedElement(int arr[]){
//       ArrayList<Integer> ans=new ArrayList<>();
      
//       for(int i=0;i<arr.length;i++){

//         if(ans.size()==0 || ans.get(ans.size()-1) != arr[i]) {
//            int cnt =0;

//             for(int j=0 ;j<arr.length ;j++){
//                 if(arr[i] == arr[j]){
//                     cnt++;
//                 }
//             }
//                 if(cnt > arr.length/3){
//                     ans.add(arr[i]);
//                 }
//                 if(ans.size() == 2){      
//                     break;
//                 }
//             }
//       }
//       return ans;
//     }
//  public static void main(String[] args){
//     Scanner sc =new Scanner(System.in);

//     System.out.println("Enter the size of array");
//     int n= sc.nextInt();

//     int arr[]=new int[n];
//     System.out.println("Enter the element of array");
//     for(int i=0;i<n;i++){
//         arr[i]=sc.nextInt();   
//     }

//     ArrayList<Integer> result=new ArrayList<>();
//     result= repeatedElement(arr);
//     System.out.println("Repeated element more than 2 times"+result);

//  }   
// }


//  in simple array  arr.length is used while in arrayList arr.size() is used 
//  better approach using hash map
// import java.util.*;
// public class Arr35{
//   public static ArrayList<Integer> majorityElement(ArrayList<Integer> a){

//     ArrayList<Integer> ans=new ArrayList<>();
//     HashMap<Integer,Integer> map= new HashMap<>();

//     int n=a.size();
//     int mini= (n/3) + 1;

//     for(int i=0;i<a.size();i++){
//         // map[a[i]]++;  in hash map we wirte it like this
//         map.put(a.get(i), map.getOrDefault(a.get(i), 0) + 1);
//        if(map.get(a.get(i)) >= mini && !ans.contains(a.get(i))){
//         ans.add(a.get(i));
//        }
//        if(ans.size() == 2){
//         break;
//        }
//     }
//     return ans;
//   }

//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int n= sc.nextInt();

//         ArrayList<Integer> a=new ArrayList<>();
//         System.out.println("Enter the element of array");
//         for(int i=0;i<n;i++){
//             a.add(sc.nextInt());
//         }
//         ArrayList<Integer> result= new ArrayList<>();
//         result =majorityElement(a);
//         System.out.println("The majority elemnt are"+ result);
//     }
// }



// 