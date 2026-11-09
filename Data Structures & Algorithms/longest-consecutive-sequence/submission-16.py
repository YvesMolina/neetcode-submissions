class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        numSet = set(nums)

        longest = 0

        for num in numSet:
            if num - 1 not in numSet:
                cur = 1
                while num in numSet:
                    longest = max(cur, longest)
                    num += 1
                    cur += 1
        
        return longest

