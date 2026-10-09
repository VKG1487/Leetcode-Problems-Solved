class Solution:
    def maxFrequencyElements(self, nums: list[int]) -> int:
        freq = Counter(nums)
        max_freq = total = 0
        for count in freq.values():
            if count > max_freq:
                max_freq = count
                total = count
            elif count == max_freq:
                total += count
        return total