import java.util.Arrays;
public class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int count = 0;
        int curMax = 0;
        int i = 0;

        while(curMax < target){
            if(i < coins.length && coins[i] <= curMax + 1){
                curMax += coins[i];
                i++;
            }
            else{
                curMax = curMax * 2 + 1;
                count++;
            }
        }

        return count;
    }
}
