class Solution(object):
    def isPerfectSquare(self, num):
        if num<2:
            return True
        l,r=2,num//2
        while l<=r:
            m=(r+l)//2
            a=m*m
            if a==num:
                return True
            elif a>num:
                r=m-1
            else:
                l=m+1        
        return False
        