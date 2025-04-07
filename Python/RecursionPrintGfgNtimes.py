#User function Template for python3

class Solution:
    def printGfg(self, n):
        # Code here
        print ("GFG ", end="")
        if n!=1:
            self.printGfg(n-1)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        ob.printGfg(N)
        print()
        print("~")
# } Driver Code Ends

#https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times
