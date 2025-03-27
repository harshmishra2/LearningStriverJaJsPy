//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        
        int smaller = a > b ? a : b;
        int r1 = 1;
        
        int k = 1;
        while(k <=smaller){
            if(a%k== 0 && b%k ==0){
                if(k>r1){
                    r1= k;
                }
            }
            k++;
        }
        
        int r2 = (a*b)/r1;
        
        // int i = 1, j = 1;
        // while(a*i != a*j){
        //     if(a*i>b*j){
        //         j++;
        //     }
        //     else if(a*i<b*j){
        //         i++;
        //     }
        // }
        
        return new int[]{r2, r1};
        
    }
}

//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1


//{ Driver Code Starts.

// } Driver Code Ends
