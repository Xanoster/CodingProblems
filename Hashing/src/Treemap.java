import java.util.*;
public class Treemap {
    public static void main(String[] args){
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("Pankaj",21);
        tm.put("Neha",17);
        tm.put("Anu",20);
        tm.put("Aditya",18);
        System.out.println(tm);
      Set<String>hashSet=tm.keySet();
      for(String s:hashSet){
          System.out.println(s);
      }
    }
}