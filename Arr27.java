import java.util.*;
public class Arr27 {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a){
        int n=a.size();
        int ind= -1;


        for(int i=n -2 ;i>=0;i--){
        if(a.get(i) <a.get(i+1)){
            ind =i;
            break;
        }
      }

      if(ind == -1){
        Collections.reverse(a);
        return a;
      }

      for(int i= n-1 ;i> ind;i--){
        if(a.get(i) > a.get(ind)){
            int temp =a.get(i);
            // a.get(i) = a.get(ind);
            // a.get(ind) =temp;
           a.set(i, a.get(ind));
           a.set(ind, temp);
            break;
        }
      }

      Collections.reverse(a.subList(ind +1 ,a.size()));
      return a;

    }
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2,4,3,6,8));
        System.out.println(nextPermutation(list)); 
    }
}
