class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:

        res = 0
        curSum = 0
        preSum = {0: 1}

        for num in nums:
            curSum += num
            res += preSum.get(curSum - k, 0)
            preSum[curSum] = preSum.get(curSum, 0) + 1
        
        return res
