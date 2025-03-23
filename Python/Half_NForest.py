#https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
def nForest(n:int) ->None:
    # Write your solution here.

    for x in range(n+1):
        for y in range(x):
            print('* ', end='')
            if(y==x-1):
                print()

    pass
