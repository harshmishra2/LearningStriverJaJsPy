#User function Template for python3

class Solution:
    def sumOfSeries(self,n):
        #code here
        """sum = 0
        for n in range (n+1):
            sum += n**3a
        return sum"""
        
        sum = n**3
        if n>0:
            sum += self.sumOfSeries(n-1)
        return sum
    
    #https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        N=int(input())
        ob=Solution()
        print(ob.sumOfSeries(N)) 
        print("~")
# } Driver Code Ends
