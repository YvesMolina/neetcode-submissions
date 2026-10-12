class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""

        for i in range(len(strs[0])):
            cur = strs[0][i]
            for word in strs:
                if not word:
                    return ""
                if len(word) < i + 1:
                    return res
                if word[i] != cur:
                    return res
            res += cur
        return res
                