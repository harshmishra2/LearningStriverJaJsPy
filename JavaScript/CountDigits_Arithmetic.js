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
        let res = obj.evenlyDivides(N);
        console.log(res);

        console.log("~");
    }
}

// } Driver Code Ends

// } Driver Code Ends


// User function Template for javascript

/**
 * @param {number} n
 * @returns {number}
 */

class Solution {
    // Function to check whether the number evenly divides n.
    evenlyDivides(n) {
        // code here
        let result =0;
        let num = n;
        
        while(num!=0){
            if(num%10 != 0 && n%(num%10)==0){
                result = result+1;
            }
            num = Math.floor(num/10);
        }
        return result;
    }
}

//https://www.geeksforgeeks.org/problems/count-digits5716/1
