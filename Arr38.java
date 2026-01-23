import java.util.*;
public  class Arr38 {
    public static int subArray(int []nums,int n,int target){
        int cnt=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor=xor^nums[j];

                if(xor == target){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
  public static void main(String []args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the sum of array  to be founded");
 
     int target =sc.nextInt();

    int [] nums= {4,2,2,6,4};
    int n =nums.length;

    int result = subArray(nums,n,target);

   System.out.println(result);

  }
}
 