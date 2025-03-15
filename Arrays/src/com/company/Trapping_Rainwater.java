package com.company;

public class Trapping_Rainwater {
    public static void trapRainwater(int height[]) {
        int n = height.length;
        //calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            //waterLevel=min(LeftMax,RightMax)
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        //loop
        int trapWater = 0;
        for (int i = 1; i < n; i++) {
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            //trapped water =water level-height[i]
          trapWater+=WaterLevel-height[i];
        }
        System.out.println(trapWater);
    }

    // QUESTION 5 using hash maps
     //will dolater
    public static void main(String[] args) {
        int a[] = {4, 2, 0, 6, 3, 2, 5};
        trapRainwater(a);
    }
}
