import java.sql.SQLOutput;
import java.util.ArrayList;

public class multiDList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(1 * i);//1 2 3 4 5
            list1.add(2 * i);// 2 4 6 8 10
            list2.add(3 * i);//3 6 9 12 15
        }
        mainlist.add(list);
        mainlist.add(list1);
        mainlist.add(list2);
        System.out.println(mainlist);

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
    }
}