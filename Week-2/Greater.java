
public class Greater {
    
    class Solution {
        public char nextGreatestLetter(char[] letters, char target) {
            int low = 0;
            int high = letters.length - 1; 
            while (low <= high) {
                int middle = low + (high - low) / 2;
                if (letters[middle] <= target) {
                    low = middle + 1;
                } else {
                    high = middle - 1;
                }
            }
           
            return letters[low % letters.length];
        }
    }
}
