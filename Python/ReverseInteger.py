class Solution(object):
    def reverse(self, x):
        result = 0
        sign = 1 
        if x<0:
            sign = -1
            x *= -1

        while x > 0:
            result = result*10 + x%10
            x //= 10
        
        result *= sign

        if result > 2**31 - 1 or result < -2**31:
            return 0

        return result
#https://leetcode.com/problems/reverse-integer/
