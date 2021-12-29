package xxl.job.admin.util;

import java.util.*;

/**
 * 给你一个整数数组 arr 和一个整数 difference，请你找出并返回 arr 中最长等差子序列的长度，该子序列中相邻元素之间的差等于 difference 。
 *
 * 子序列 是指在不改变其余元素顺序的情况下，通过删除一些元素或不删除任何元素而从 arr 派生出来的序列。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [1,2,3,4], difference = 1
 * 输出：4
 * 解释：最长的等差子序列是 [1,2,3,4]。
 * 示例 2：
 *
 * 输入：arr = [1,3,5,7], difference = 1
 * 输出：1
 * 解释：最长的等差子序列是任意单个元素。
 * 示例 3：
 *
 * 输入：arr = [1,5,7,8,5,3,4,2,1], difference = -2
 * 输出：4
 * 解释：最长的等差子序列是 [7,5,3,1]。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-arithmetic-subsequence-of-given-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestSubsequence {

    public static void main(String[] args) {
        //[4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8] 0
        //[4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8]
        //[4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8]
        //0
        int[] num={4,12,10,0,-2,7,-8,9,-9,-12,-12,8,8};
        int i = longestSubsequence(num, 0);
        System.out.println(i);
    }

    public static int longestSubsequence(int[] arr, int difference) {
        if(arr.length<=1){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return minStep(difference, set, arr);
    }

    private static int minStep(int difference, Set<Integer> set, int[] arr) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        int minStep = 0;
        int number = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            Integer num = arrayList.get(i);
            Integer numberTake = num;
            int realStep = 0;
            int tem = num;
            Set indexs=new HashSet();
            int index=i;
            while (set.contains(num) && set.contains(tem) && index <= arrayList.lastIndexOf(tem) && !indexs.contains(index) && index>=i ) {
                num = tem;
                tem = tem + difference;
                realStep++;
                indexs.add(index);
                index = arrayList.lastIndexOf(tem);
            }
            if (realStep > minStep) {
                minStep = realStep;
                number = numberTake;
            }
        }
        return minStep;
    }


}
