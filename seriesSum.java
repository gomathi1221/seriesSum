class Solution {
    public static int seriesSum(int n) {
        // code here
        int s=0;
        for(int i=1;i<=n;i++){
            s+=i;
        }
        return s;
    }
}