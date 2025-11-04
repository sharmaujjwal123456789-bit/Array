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
