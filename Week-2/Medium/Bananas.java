
public class Bananas {
   

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //Arrays.sort(piles);
        int low = 1; 
        int high = piles[piles.length - 1]; 
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalH = compute(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int compute(int nums[], int h) {
        int totalH = 0;
        for (int i = 0; i < nums.length; i++) {
            totalH += Math.ceil((double) nums[i] / (double) h);
        }
        return totalH;
    }
}
    
}
