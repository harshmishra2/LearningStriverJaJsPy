class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        v2 = str(x)[::-1]
        
        return str(x) == v2

#https://leetcode.com/problems/palindrome-number/description/

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """

        if x<0:
            return False
        
        xcopy = x
        v = 0

        while x>0 :
            v = v*10 + x%10
            x //= 10
        
        return v == xcopy

#https://leetcode.com/problems/palindrome-number/
