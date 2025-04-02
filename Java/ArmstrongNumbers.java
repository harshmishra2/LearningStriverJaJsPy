import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int temp = num;
		// int temp1 = num;

		int sum = 0;
		int count = 0; 
		
		while(temp!=0){
			count ++;
			temp /= 10;
		}

		temp = num;
		//we got our count of digits here

		for(int i=0; i<count ; i++){
			sum += Math.pow(temp % 10, count);
			temp /= 10;
		}

    //by now we've acquired the sum of all the digits raised to the power of the total number of digits
    //after employing the Math.pow() method from the Math class in java

		if (sum == num){
			return true;
		}
		return false;
	}
}

//https://www.naukri.com/code360/problems/armstrong-number_1462443?leftPanelTabValue=SUBMISSION
