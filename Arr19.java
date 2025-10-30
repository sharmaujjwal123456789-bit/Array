// brute force approach for missing number 
public class Arr19 {
    public static void main(String[] args){
        int []arr={1,2,4,5};
        int N=5;
        int flag;
        for(int i=1;i<=N;i++){
            flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Missing number :"+ i);
            }
        }
    }    
}
