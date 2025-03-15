import java.util.*;
public class ContainerWater {
    public static int getContainer(ArrayList<Integer>water){
        //bruteforce method
        int maxWater=0;
        for(int i=0; i<water.size(); i++){
            for(int j=0; j<water.size(); j++){
                int height = Math.min(water.get(i), water.get(j));
                int width =j-i;
                int currWater=height*width;
                maxWater=Math.max(currWater,maxWater);
            }
        }
        return maxWater;
    }

    //optimised method 2 pointer approach

public static int optimised(ArrayList<Integer>height){
        int maxWater=0;
        int lp=0;
        int rp = height.size()-1;
        while(lp<rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width =rp-lp;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);

            //upddate ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
}
    public static void main(String[] args) {
        ArrayList<Integer> water=new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(6);
        water.add(2);
        water.add(5);
        water.add(4);
        water.add(8);
        water.add(3);
        water.add(7);
        System.out.println(optimised(water));
    }
}
