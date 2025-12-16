//  finding the element in pascal triangle in nth row and nth column
// import java.util.*;
// public class Arr34 {
//     public static long nCr(int n, int r){
//         long res=1;

//         for(int i=1;i<r;i++){
//             res = res *  (n-i);
//             res = res / (i);
//         }  
//         return res;
//     }
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);

//         System.out.println("Enter the row no.");
//         int n= sc.nextInt();

//         System.out.println("Enter the element in column");
//         int r=sc.nextInt();
         
//         long result = nCr(n, r);
//         System.out.println("the result is "+ result);

//     }
// }


//  print the pascal triangle full row
//  import java.util.*;
//  public class Arr34{
//     public static void row(int n){

//         int ans=1;
//         System.out.print(ans);
//         for(int i=1 ;i< n;i++){
//             ans= ans * (n-i);
//             ans= ans / (i);
//             System.out.print(" " + ans);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the row to be printed");
//         int n= sc.nextInt();
//         row(n);
//     }
//  }


// for printing the pascal full triangle 
import java.util.*;
public class Arr34{
    public static ArrayList<Integer> generateRow(int row){

        long ans=1;
        ArrayList<Integer> ansRow =new ArrayList<>();
        ansRow.add(1);

        for(int col =1 ; col< row ; col++){
            ans = ans * (row - col);
            ans = ans / (col);
            ansRow.add((int)ans);
        }
        return ansRow;
    }
    public static void main(String[] args){

   Scanner sc= new Scanner(System.in);
   ArrayList<List<Integer>> ans = new ArrayList<>();

   System.out.println("Enter the no. of rows");
   int n= sc.nextInt();

   for(int i=1;i<=n;i++){
    ans.add(generateRow(i));
   }

   System.out.print(ans);
 }     
}