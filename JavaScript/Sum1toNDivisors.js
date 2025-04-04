//{ Driver Code Starts
// Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => { inputString += inputStdin; });

process.stdin.on('end', _ => {
    inputString =
        inputString.trim().split('\n').map(string => { return string.trim(); });

    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let N = parseInt(readLine());
        let obj = new Solution();
        let res = obj.sumOfDivisors(N);
        console.log(res);

        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript
/**
 * @param {number} n
 * @returns {number}
 */

class Solution {
    // Function to find sum of divisors
    sumOfDivisors(n) {
        // your code here
        let sum = 0;
        for(let i=1; i<=n; i++){
            for(let j=1; j<=i; j++){
                if(i%j==0){
                    sum += j;
                }
            }
        }
        return sum;
    }
}

//https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
