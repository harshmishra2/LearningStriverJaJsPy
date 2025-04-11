//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        long fact = 1l;
        ArrayList<Long> al = new ArrayList<>();
        // al.add(1L);
        if(n == 1L){
            return new ArrayList<>(Arrays.asList(1L));
        }
        if(n==2){
            return new ArrayList<>(Arrays.asList(1L, 2L));
        }
        for(long i = 1L; i<n; i++){
               fact = fact*i;
               if(fact>n){
                   break;
               }else{
                   al.add(fact);
               }
            }
        return al;
        
    }
}
//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
