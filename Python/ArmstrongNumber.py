from os import *
from sys import *
from collections import *
from math import *

def isArmstrong(num):
    # Write your code here.
    temp = num
    total = 0
    count = 0

    while(temp != 0):
        count += 1
        temp //=10
    
    temp = num

    for i in range (count):
        total += (temp%10) ** count
        temp //= 10
        i += 1
    
    if(total == num):
        return 1

    return 0
    pass

    #https://www.naukri.com/code360/problems/armstrong-number_1462443?leftPanelTabValue=SUBMISSION
