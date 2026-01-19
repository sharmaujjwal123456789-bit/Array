// import java.util.*;
// public class Arr23 {
//      public static int MajorityElement(int[] a){
//          Map<Integer ,Integer> map =new HashMap<>();
     
//          for(int i=0;i<a.length;i++){
//             map.put(a[i], map.getOrDefault(a[i], 0) + 1);

//             // this means if a[i] already exist in teh map increase its count by 1
//          }
//          for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if(entry.getValue() > (a.length/2)){
//                 return entry.getKey();
//             }
//          }

//          return -1;
//      }
//      public static void main(String[] args){
//           int []a={1,2,3,1,1,1,1,2,2,4,1,1,1,1};
//         System.out.print(MajorityElement(a));
//      }
// }
 

// public class Arr23{
//     public static void main(String []args){
//         int []arr={1,2,3,2,1,1,1,1,1,2,2,3,1};
//         int el =0;
//         int cnt = 0;
//         for(int i=0; i<arr.length ;i++){
//             if(cnt == 0){
//                 el=arr[i];
//                 cnt =1;
//             }
//         else if(arr[i] == el){
//             cnt++;
//         }else{
//             cnt--;
//         }
//     }
//         int cnt1=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] == el){
//                 cnt1++;
//             }
//         }
//         if(cnt1 > arr.length/2){
//             System.out.print(el);
//         }else{
//             System.out.println(-1);
//         }
//     }
// }