import java.util.*;
public class unionAndIntersection {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int nums[]={2,1,6,3};


        //Union
        HashSet<Integer>Unique=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            Unique.add(arr[i]);
        }
        for (int i=0;i<nums.length;i++){
            Unique.add(nums[i]);
        }
        System.out.println("UNION "+Unique);

        //Intersection
        Unique.clear();
        for(int i=0;i<arr.length;i++){
            Unique.add(arr[i]);
        }
        int count=0;
        HashSet<Integer>intersection=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(Unique.contains(nums[i])){
               count++;
               intersection.add(nums[i]);
            }
        }
        System.out.println(count);
        System.out.println(intersection);
    }
}
