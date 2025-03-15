package com.company;

public class ithBit {
    public static int getBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateBit(int n, int i, int newBit) {
//        if (newBit == 0) {
//            return clearBit(n, i);
//        } else {
//            return setBit(n, i);
//        }
//    }
        n = clearBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clearLastBit(int n, int i) {
        int bitmask = (-1 << i);
        return n & bitmask;

    }

    public static int clearBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean powerOf2(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSet(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {  //check lsb
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(fastExpo(5, 3));
    }
}
