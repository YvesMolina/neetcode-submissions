class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        maj = 0

        for num in nums:
            if maj == 0:
                curMaj = num
            if num == curMaj:
                maj += 1
            else:
                maj -= 1
        
        return curMaj