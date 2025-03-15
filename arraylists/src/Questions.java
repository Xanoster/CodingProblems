import java.util.*;

public class Questions {

    //Monotonic ArrayList
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                inc = false;
            }
            if (list.get(i) < list.get(i + 1)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    //question 2 lonely numbers
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.size();
        for (int i = 1; i < n - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
        if (n == 1) {
            list.add(nums.get(0));
        }
        if (n > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }
            if (nums.get(n - 2) + 1 < nums.get(n - 1)) {
                list.add(nums.get(n - 1));
            }
        }
        return list;
    }

    //Most Frequent Number following Key (easy)
    public static int mostFrequent(ArrayList<Integer> list, int key) {
        int[] result = new int[1001];       //leetcode 1000 boxes
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                result[list.get(i + 1)]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1001; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i;
            }
        }
        return ans;
    }

    //Beautiful ArrayList (MEDIUM)

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1); // initialize the array with a single element
        for (int i = 2; i <= n; i++) { // iterate from 2 to n
            ArrayList<Integer> temp = new ArrayList<>();
            for (int  e=0 ;e<ans.size();e++) { //for(Integer:e)
                if (2 * ans.get(e) <= n) temp.add(ans.get(e) * 2);
            } // add all even elements to the temporary array//2 ,4 2,4 2
            for (Integer e : ans) {
                if (2 * e - 1 <= n) temp.add(e * 2 - 1);//1, 3 1, 3 1
            } // add all odd elements to the temporary array
            ans = temp; // update the array for the next iteration
        }
        return ans; // return the final beautiful array
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(2);
        list.add(1);
        list.add(100);
        ArrayList<Integer>Array=beautifulArray(4);
        System.out.println(Array);
    }
}