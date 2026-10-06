from collections import Counter
class Solution(object):
    def isIsomorphic(self, s, t):
        if len(s)!=len(t):
            return False
        return [s.index(c) for c in s] == [t.index(c) for c in t]