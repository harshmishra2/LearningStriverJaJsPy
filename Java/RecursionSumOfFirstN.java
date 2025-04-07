//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.sumOfSeries(N));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
// import Math
class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum = (int)Math.pow(n, 3); 
        
        if(n>0){
            sum += sumOfSeries(n-1);
        }
        
        return sum;
        
    }
}
//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
