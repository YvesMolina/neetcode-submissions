class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        numLen = len(nums)
        prev = [1 for i in range(numLen)]

        for i in range(1, numLen):
            prev[i] = nums[i - 1]
            prev[i] *= prev[i - 1]
        
        end = [1 for i in range(numLen)]
        for i in range(numLen - 2, -1, -1):
            end[i] = nums[i + 1]
            end[i] *= end[i + 1]

        res = [0 for _ in range(numLen)]
        for i in range(numLen):
            res[i] = prev[i] * end[i]

        return res

        