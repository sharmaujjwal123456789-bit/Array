// import java.util.Scanner;
// public class Arr18 {
//     public static void main(String[] args){
//         int n;
//     int []arr={1,4,23,43,23};
//     int temp=arr[0];
//     for(int i=1;i<arr.length;i++){
//         arr[i-1]=arr[i];
//     }
//     arr[arr.length-1]=temp;
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" "); 
//     }
// }
// }


// left rotate the array by d place
//isme hum sabse phele jitne tk d(rotate krna hai )  usse ham temp array mein daal rhe hai
// uska next mein jitne bhi d ke baad element hai unhe hum new array mein daal rhe through zero index se
// uske baad usi array mein temp array ke elemnet daal rhe hai last mein 



// import java.util.Scanner;
// public class Arr18{
//     public static void leftRotate(int[] arr,int n,int d){
//         d = d % n;

//         int temp[]=new int[d];
//         for(int i=0;i<d;i++){
//             temp[i]=arr[i];
//         }
//         // System.out.print(temp[i]);
//         for(int i=d;i<n;i++){
//             arr[i-d]=arr[i];
//         }
//         for(int i=n-d;i<n;i++){
//             arr[i]=temp[i-(n-d)];
//         }
//         // return arr[i];
        
//     }

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter the Size of array");
//         int n=sc.nextInt();
//         int []arr=new int[n];

//         System.out.println("Enter the "+n+"Integer");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//        System.out.println("Enter the arrray to be rotated after d place");
//         int d=sc.nextInt();
//          leftRotate(arr,n,d);
//            for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//          }
       
//     }
// }


//  move all the zeroes to the end of array
// isme hum pheli loop mein jitne bhi array mein nonzero element hai unhe hum 
// temp array mein daal rhe uske baad hum unhe ek simple array ein daal rhe hai
// upto jitni uski length hai temp.length phir next loop mein hum temp.length se jitni intial array ki length thi utni tak zero daal reh hai 

// import java.util.Scanner;
// public class Arr18{
//     public static void MoveZeroEnd(int[] arr,int n){
        
        
//         int temp[]=new int[n];
//         int index=0;
//         for(int i=0;i<n;i++){
//             if(arr[i] != 0){
//               temp[index]=arr[i];
//               index++;
//             }
//         }
//         for(int i=0;i<temp.length;i++){
//             arr[i]=temp[i];
//         }
//         for(int i=temp.length;i<n;i++){
//             arr[i]=0;
//         }   
//     }
//  public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter the Size of array");
//         int n=sc.nextInt();
//         int []arr=new int[n];

//         System.out.println("Enter the "+n+"Integer");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
 
//          MoveZeroEnd(arr,n);
//            for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//          }     
//     }
// }


//  optimal approach for zero at the end
// first loopit will check if there is a zero in it if there is it will go to the thrd loop directly
//  second if will just check if there is no zero in array it will return it 
//  the third will work like assume zero is in index 1 then it will give j value =1 then it i will became 2(j+1) then it will check if it is
// non zero then it arrange the zero and non zero in it (refer to notebook)

// import java.util.Scanner;
// public class Arr18{
//     public static void  MoveZeroEnd(int[] arr,int n){
//     int j=-1;
//     for(int i=0;i<n;i++){
//         if(arr[i]==0){
//             j=i;
//             break;
//         }
//     }

//     if(j==-1){ 
//         return ;
//     }
  
//     for(int i=j+1;i<n;i++){
//         if(arr[i] !=0){
//         int temp=arr[j];
//         arr[j]=arr[i];
//         arr[i]=temp;
//         j++;
//         }
//     }
//     // return arr;
//     }

//     public static void main(String[]args){
//         Scanner sc =new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
//         System.out.println("Enter the size of "+n+"array");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         MoveZeroEnd(arr, n);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//  linear search
// import java.util.Scanner;
// public class Arr18{
//     public static int linear(int[] arr,int n,int num){
//         for(int i=0;i<n;i++){
//             if(arr[i]==num){
//                 return i;
//             }
//         }  
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the size of array");
//         int n=sc.nextInt();

//         int arr[]=new int[n];
//         System.out.println("Enter the "+n+"Integer ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Eneter the no.to be search");
//         int num=sc.nextInt();
 
//         int i=linear(arr,n,num);
    
//         System.out.print(i);
        
//     } 
// }


//  optimal appproach for union of two sorted array 

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Arr18{
//     public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){  
//     int n1=a.size();
//     int n2=b.size();
//     int i=0;
//     int j=0;
//     ArrayList<Integer> unionArr= new ArrayList<>();

//     while(i< n1 && j< n2){
//         if(a.get(i) <= b.get(j)){
//     //  unionArr.get(unionArr.size()-1 != a.get(i)) means that the union array last element not equal to the upcomin element 
//       if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != a.get(i)){
//         unionArr.add(a.get(i));
//         }
//         i++;
//       }
//       else{
//           if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != b.get(j)){
//         unionArr.add(b.get(j));
//       }
//       j++;
//     }
// }
//     while(j<n2){
//     if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != b.get(j)){
//         unionArr.add(b.get(j));
//     }
//     j++;
// }

// while(i<n1){
//       if(unionArr.size() == 0 || unionArr.get(unionArr.size()-1) != a.get(i)){
//         unionArr.add(a.get(i));
//     }
//     i++;
// }
//     return unionArr;
// } 
    

//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the Size of array a");
//         int n1=sc.nextInt();
//         ArrayList<Integer> a=new ArrayList<>();

//         System.out.println("Enter the elemnt 1st array");

//         for(int i=0;i<n1;i++){
//             a.add(sc.nextInt());
//         }

//         System.out.println("Enter the Size of array b");
//         int n2=sc.nextInt();
//         ArrayList<Integer> b=new ArrayList<>();
        
//         System.out.println("Enter the element of 2nd array");
//         for(int j=0;j<n2;j++){
//             b.add(sc.nextInt());
//         }
//          ArrayList<Integer> result=union(a,b);

//          System.out.println(result);

//     }

// }


//  optimal approachh for intersection of two array 

// import java.util.ArrayList;
// import java.util.Scanner;
// public class Arr18{
//     public static ArrayList<Integer> inter(ArrayList<Integer> a,ArrayList<Integer> b){
//         int n1=a.size();
//         int n2=b.size();
//         int i=0;
//         int j=0;
//         ArrayList<Integer> intersection= new ArrayList<>();

//         while(i<n1 && j<n2){
//             if(a.get(i) < b.get(j)){
//                 i++;
//             }
//             else if(b.get(j) < a.get(i)){
//                 j++;
//             }
//             else{
//                 intersection.add(a.get(i));
//                 i++;
//                 j++;
//             }
                
//             }
    //     return intersection;

    //     }


    //     public static void main(String[] args){
    //         Scanner sc= new Scanner(System.in);

    //         System.out.println("Enter the size of the array a");
    //         int n1 =sc.nextInt();
    //         ArrayList<Integer> a=new ArrayList<>();

    //         System.out.println("Enter the element of 1st array");

    //         for(int i=0;i<n1;i++){
    //             a.add(sc.nextInt());
    //         }

    //         System.out.println("Enter the size of array b");
    //         int n2=sc.nextInt();
    //         ArrayList<Integer> b=new ArrayList<>();

    //         System.out.println("Enter the element of 2nd array");
    //         for(int j=0;j<n2;j++){
    //             b.add(sc.nextInt());
    //         }
    //         ArrayList<Integer> result=inter(a,b);
    //         System.out.println(result);

            

    //      }
    // }


