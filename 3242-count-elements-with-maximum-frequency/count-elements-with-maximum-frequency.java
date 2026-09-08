class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];

        // Count frequency
        for (int num : nums) {
            freq[num]++;
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Sum frequencies having maximum frequency
        int ans = 0;
        for (int count : freq) {
            if (count == maxFreq) {
                ans += count;
            }
        }

        return ans;
    }
}
