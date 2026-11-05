class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for word in strs:
            encoded += str(len(word)) + "#" + word
        return encoded

    def decode(self, s: str) -> List[str]:
        res = []
        while s:
            prefix = ""
            c = s[0]
            while c != "#":
                prefix += c
                s = s[1:]
                c = s[0]
            s = s[1:]
            prefix = int(prefix)
            res.append(s[:prefix])
            s = s[prefix:]
        return res