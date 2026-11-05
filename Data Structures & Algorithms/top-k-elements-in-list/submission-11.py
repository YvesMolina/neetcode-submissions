class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        frequencies = [[] for _ in range (len(nums) + 1)]
        occs = defaultdict(int)
        for num in nums:
            occs[num] += 1
        
        for idx, freq in occs.items():
            frequencies[freq].append(idx)
        
        res = []
        for i in range(len(frequencies) - 1, -1, -1):
            for freq in frequencies[i]:
                res.append(freq)
            if len(res) == k:
                return res


            