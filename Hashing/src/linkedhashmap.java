import java.util.LinkedHashMap;
import java.util.Set;

public class linkedhashmap {
    public static void main(String[] args){
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",38);
        lhm.put("Afghan",338);
        lhm.put("Brazil",138);
        lhm.put("Turkey",123);
        System.out.println(lhm);
        Set<String> hashSet=lhm.keySet();
        for(String s:hashSet){
            System.out.println(s);
        }
    }
}