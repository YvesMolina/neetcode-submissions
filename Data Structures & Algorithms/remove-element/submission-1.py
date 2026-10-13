class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        
        occs = 0
        l = 0
        r = len(nums) - 1

        while l <= r:
            while l < r and nums[r] == val:
                r -= 1
                occs += 1
            if nums[l] == val:
                nums[l], nums[r] = nums[r], nums[l]
                r -= 1
                occs += 1
            l += 1
            print(nums, occs)
        # nums = nums[:(r + 1)]
        print(nums)
        return len(nums) - occs
            