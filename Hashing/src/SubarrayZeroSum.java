import java.util.*;
public class SubarrayZeroSum {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer>map=new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        System.out.println(len);
    }
}
