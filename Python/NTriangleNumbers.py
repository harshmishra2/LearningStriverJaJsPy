def nTriangle(n:int) ->None:
    # Write your solution here.

    for x in range(n+1):
        for y in range (x):
            print(y+1, end=' ')
            if(y== x-1):
                print('')
    pass
#https://www.naukri.com/code360/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
