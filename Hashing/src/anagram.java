import java.util.*;
public class anagram{
    public static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            //map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            }else{
                map.put(a.charAt(i),1);
            }
        }
        for(int i=0;i<b.length();i++){
            if(map.get(b.charAt(i))!=null){
                if(map.get(b.charAt(i))==1){
                    map.remove(b.charAt(i));
                }else{
                    map.put(b.charAt(i),map.get(b.charAt(i))-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args){
   String a="Paffaj";
   String b="ankajP";
        System.out.println(isAnagram(a,b));
    }
}