// https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

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
        inputString.trim().split("\n").map(string => { return string.trim(); });

    main();
});

function readLine() { return inputString[currentLine++]; }

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for (; i < t; i++) {
        let str = readLine().trim();
        let obj = new Solution();
        let res = obj.dataTypeSize(str);
        console.log(res);
        console.log("~");
    }
}

// } Driver Code Ends


// User function Template for javascript
/**
 * @param {string} str
 * @returns {number}
 */

class Solution {
    // Function to find the size of different data types.
    dataTypeSize(str) {
        // your code here
        if(str=="Character"){
            return 1;
        }
        else if(str==("Integer")){
            return 4;
        }
        else if(str==("Double")){
            return 8;
        }
        else if(str==("Float")){
            return 4;
        }
        else if(str==("Long")){
            return 8;
        }
        else return -1;
    }
}
