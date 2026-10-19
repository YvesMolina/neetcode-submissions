class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        if len(nums) <= 1:
            return nums

        m = len(nums) // 2
        left = self.sortArray(nums[:m])
        right = self.sortArray(nums[m:])

        return self.mergeLists(left, right)

    def mergeLists(self, left, right):
        merged = []
        l = 0
        r = 0
        while l < len(left) and r < len(right):
            if left[l] < right[r]:
                merged.append(left[l])
                l += 1
            else:
                merged.append(right[r])
                r += 1
        if l == len(left):
            merged.extend(right[r:])
        else:
            merged.extend(left[l:])
        return merged
