class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int p : piles) {
            high = Math.max(high, p);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            long hours = 0;
            for (int p : piles) {
                hours += (p + (long) mid - 1) / mid;
                if (hours > h) break;
            }

            if (hours <= h) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}