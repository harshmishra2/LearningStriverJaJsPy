import math

## Read input as specified in the question.
## Print output as specified in the question.


def is_prime(n):
    if n<=1:
        return "NO"
    for i in range (2, int(math.sqrt(n))+1):
        if n%i==0:
            return "NO"
    return "YES"

n = int(input())
result = is_prime(n)
print (result)

#https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
