import java.util.ArrayList;
public class Swap {
    public static void swap(ArrayList<Integer> list,int indx1,int indx2){
       int temp=list.get(indx1);
       list.set(indx1, list.get(indx2));
       list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
            list.add(21);
            list.add(42);
            list.add(53);
            list.add(93);
            int idx1=1;int idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
    }
}
