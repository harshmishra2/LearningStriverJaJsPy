#User function Template for python3
#https://www.geeksforgeeks.org/problems/count-digits5716/1
class Solution:
    def evenlyDivides(self, n):
        # code here
        result = 0
        num = n
        while(num!=0):
            if(num%10!=0 and int(n%(num%10)==0)):
                result += 1
            num //= 10
        return result

# '&' in python is a bitwise operator and hence cannot be used with variables.
# '/' this is a floating division, '//' should be used to as this is int division and will avoid trouble in future.

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())

        ob = Solution()
        print(ob.evenlyDivides(N))
        print("~")

# } Driver Code Ends
