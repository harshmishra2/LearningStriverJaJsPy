public class Solution {
    public static void nForest(int n) {
        // Write your code here

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");

                if(j==i-1){
                    System.out.println("");
                }
            }
        }
    }
}
//https://www.naukri.com/code360/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
