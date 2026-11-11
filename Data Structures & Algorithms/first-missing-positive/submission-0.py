class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        
        limit = len(nums)
        i = 0

        while i < limit:
            j = nums[i] - 1
            if nums[i] - 1 >= limit or nums[i] - 1 < 0 or nums[j] == nums[i]:
                i += 1
            else:
                nums[i], nums[j] = nums[j], nums[i]

        for i in range(len(nums)):
            if nums[i] != i + 1:
                return i + 1
        return limit + 1
            