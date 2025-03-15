import java.util.*;

//sorted and rotated array

public class pairSum2 {
    public static boolean optimised(ArrayList<Integer> list, int target) {

        int bp = -1; // breaking point to know lp ; this is invalid index
        int n = list.size();

        for (int i = 0; i < n ; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallest
        int rp = bp;   //largest

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            //case 1
            if (sum == target) {
                return true;
            }
            //case 2
            if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                //case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    //bruteforce can be applied here
    //optimised code by 2 pointer
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(11);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(optimised(list, 9));

    }
}
