import java.util.*;

public class IterationOnHashMap {
    public static void main(String[]args){

        HashMap<String,Integer>hm=new HashMap<>();

        hm.put("India",3741);
        hm.put("China",941);
        hm.put("Afghan",134);
        hm.put("Bangla",123);
        Set<String>keys= hm.keySet();
        System.out.println(keys);
        for(String k:keys){
            System.out.println(k+" "+hm.get(k));
            //we can also use entry set

        }
        System.out.println("Entry SET");
        System.out.println(hm.entrySet());
    }
}
