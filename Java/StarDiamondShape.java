public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here

        for(int i=0; i<n; i++){

            for(int j=0; j<(2*n)-1; j++){
                if(j<=n-1+i && j>=n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(j==(2*n)-2){
                    System.out.println();
                }
            }

        }

        for(int i=n-1; i>-1; i--){
            
            for(int j= 0; j<(2*n)-1; j++){
                if(j<=n-1+i && j>=n-1-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                if(j==(2*n)-2){
                    System.out.println();
                }
            }
        }
    }
}
//https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
