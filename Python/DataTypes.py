#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

#User function Template for python3

class Solution:
    def dataTypeSize(self, str):
        # Code here
        if str == 'Character': 
            return 1
        elif str == 'Integer': 
            return 4
        elif str == 'Float': 
            return 4
        elif str == 'Long': 
            return 8
        elif str == 'Double': 
            return 8
        else: 
            return -1
#{ 
 # Driver Code Starts.
if __name__ == '__main__': 
    t = int(input ())
    for _ in range (t):
        str = input()
        ob = Solution()
        res = ob.dataTypeSize(str)
        print(res)
        print("~")
# } Driver Code Ends


# https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type
