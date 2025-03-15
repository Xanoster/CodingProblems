import java.util.*;
public class DistinctElemetns {
    public static void main(String[] args){
        int arr[]={1,2,3,2,4,6,3,1,2,4};
        HashSet<Integer>num=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            num.add(arr[i]);
        }
        System.out.println(num);
    }
}
