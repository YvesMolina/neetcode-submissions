class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        vals = {}

        for i in range(len(nums)):
            cur = nums[i]
            dif = target - cur 

            if cur in vals:
                return [vals[cur], i]

            vals[dif] = i
