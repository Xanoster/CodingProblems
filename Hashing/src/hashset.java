import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> sets = new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(3);
        sets.add(1);
        sets.add(1);
        System.out.println(sets);
        //System.out.println(sets.size());
        sets.clear();
        //System.out.println(sets);

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Bengluru");
        cities.add("Jaipur");
//        Iterator it=cities.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());}
//        for (String name : cities) {
//            System.out.println(name);
//        }
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Bengluru");
        lhs.add("Jaipur");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("Noida");
        ts.add("noida");
        ts.add("Goa");
        ts.add("Aaaaa");
        System.out.println(ts);
    }
}

