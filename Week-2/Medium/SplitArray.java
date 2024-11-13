
public class SplitArray {
    class Solution {
        public int splitArray(int[] nums, int k) {
            int l = 0;
            int h = 0;
            for (int i : nums) {
                l = Math.max(l, i);
                h += i;
            }
            int ans = h;  
            
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (isPossible(nums, mid, k)) {
                    ans = mid;
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return ans;
        }
        
        boolean isPossible(int[] nums, int maxSum, int k) {
            int cnt = 0;
            int curSum = 0;
            for (int i : nums) {
                if (curSum + i > maxSum) {
                    cnt++;
                    curSum = i;
                } else {
                    curSum += i;
                }
            }
            cnt++;  
            return cnt <= k;
        }
    }
    
}
