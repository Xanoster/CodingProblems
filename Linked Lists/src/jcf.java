import java.util.LinkedList;
public class jcf {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.add(1);
        ll.add(3);
        ll.add(0);
        ll.remove(0);
        System.out.println(ll);
    }
}
