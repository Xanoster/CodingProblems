import java.util.*;
public class pairSum {
    //brute force
    public static boolean Sum(ArrayList<Integer>list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    //2 pointer approach for sorted arraylist
    public static boolean pointer(ArrayList<Integer>list,int target){
     int lp=0;
     int rp=list.size()-1;
     while(lp<rp){
         int sum=list.get(lp)+list.get(rp);
         //case 1:
         if( sum== target){
             return true;
         }
         //case 2:
         if(sum<target){
             lp++;
             //case 3:
         }else{
             rp--;
         }
     }
     return false;
    }
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
        System.out.println(pointer(list,9 ));
    }
}
