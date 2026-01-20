import java.util.*;

public class Arr26{
    public static int[] AlternateNumber(ArrayList<Integer> a){
        int n=a.size();
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int i=0;i<n;i++){
          if(a.get(i) > 0){
            pos.add(a.get(i));
          }else{
            neg.add(a.get(i));
          }
        }
   
        int[] ans=new int[n];

        if(pos.size() > neg.size()){
            for(int i=0;i<neg.size();i++){
                ans[2*i] =pos.get(i);
                ans[2*i+1]=neg.get(i);
            }
            int index =neg.size() * 2;
            for(int i= neg.size();i<pos.size();i++){
                ans[index] = pos.get(i);
                index++;
            }
        }
        else{
            for(int i=0;i<pos.size();i++){
                ans[2*i] =pos.get(i);
                ans[2*i+1] =neg.get(i);
            }
            int index =pos.size() * 2;
            for(int i= pos.size();i<neg.size();i++){
                ans[index] = neg.get(i);
                index++;
            }
        }
        for(int nums : ans){
            System.out.print(nums+ " ");
        }
        System.out.println();
        return ans;
    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(3,1,-2,-5,2,-4,3,2,6));
        AlternateNumber(list);
    }
}