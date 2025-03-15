import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<String,Integer>hm=new HashMap<>();

        //putting values
        hm.put("India",100);
        hm.put("China",90);
        hm.put("Pakistan",10);
        System.out.println(hm);

        //getting value for keys
        int a=hm.get("India");
        System.out.println(a);

        //check if it contains key
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("India"));

        //remove key
        hm.remove("Pakistan");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //check empty
        System.out.println(hm.isEmpty());

        //to empty whole hashmap
        hm.clear();
        System.out.println(hm);
    }
}