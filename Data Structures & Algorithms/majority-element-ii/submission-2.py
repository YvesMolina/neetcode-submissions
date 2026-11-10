class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        
        maj1 = float('inf')
        maj2 = float('inf')
        count1 = 0
        count2 = 0

        for num in nums:
            if num != maj2 and count1 == 0:
                maj1 = num
                count1 = 1
            elif num != maj1 and count2 == 0:
                maj2 = num
                count2 = 1
            elif num != maj1 and num != maj2:
                count1 -= 1
                count2 -= 1
            elif num == maj1:
                count1 += 1
            elif num == maj2:
                count2 += 1
        
        res = []
        freq1 = nums.count(maj1)
        freq2 = nums.count(maj2)
        minCount = len(nums) // 3
        if freq1 > minCount:
            res.append(maj1)
        if freq2 > minCount:
            res.append(maj2)
        
        return res