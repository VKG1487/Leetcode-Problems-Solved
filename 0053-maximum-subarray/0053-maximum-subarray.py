class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = best = nums[0]
        for i in range(1, len(nums)):
            curr = curr + nums[i] if curr > 0 else nums[i]
            best = max(best, curr)
        return best