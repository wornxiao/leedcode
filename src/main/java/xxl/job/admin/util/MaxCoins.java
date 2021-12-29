package xxl.job.admin.util;

import java.util.Arrays;
public class MaxCoins {

    public static void main(String[] args) {
        int[] piles={2,4,1,2,7,8};
        int maxCoins = maxCoins(piles);
        System.out.println(maxCoins);
    }
    public static int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int round=(int)piles.length/3;
        int sumCoin=0;
        int index=piles.length-2;
        for(int i=0;i<round;i++){
            sumCoin=sumCoin+piles[index];
            index=index-2;
        }
        return sumCoin;
    }
}
