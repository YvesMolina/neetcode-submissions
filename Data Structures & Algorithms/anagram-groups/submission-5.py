class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        words = defaultdict(list)

        for word in strs:
            alph = [0] * 26
            for c in word:
                alph[ord(c) - ord('a')] += 1
            words[str(alph)].append(word)
        
        res = []
        for anas in words.values():
            res.append(anas)
        
        return res



