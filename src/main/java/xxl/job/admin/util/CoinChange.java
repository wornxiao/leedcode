package xxl.job.admin.util;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        int amount = 6249;
        int time = coinChange(coins, amount);
        System.out.println(time);
    }

    public static int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        if (coins.length <= 0) {
            return -1;
        }
        Arrays.sort(coins);
        int time = 0;
        for (int i = (coins.length - 1); i >= 0; i--) {
            int rest = amount % coins[i];
            if (rest == 0) { //刚好莫完
                int needTime = (amount / coins[i]) > 0 ? (amount / coins[i]) : 0;
                time += needTime;
                amount=0;
                break;
            }
            if (rest > 0 && amount >= coins[i]) {
                int needTime = (amount - rest) / coins[i];
                time += needTime;
                amount = rest;
            }
        }
        if (amount > 0) {
            return -1;
        }
        return time;
    }
}
