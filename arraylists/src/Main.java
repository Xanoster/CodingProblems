import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        //to add
        list.add(1);
        list.add(2);
        list.add(5);
        System.out.println(list);

        //to get
        int i= list.get(1);
        System.out.println(i);

        // to remove
        list.remove(2);
        System.out.println(list);

        //to update
        list.set(1,3);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(6));

        //add at index
        list.add(1,7);
        System.out.println(list);

        System.out.println(list.size());
        }
}