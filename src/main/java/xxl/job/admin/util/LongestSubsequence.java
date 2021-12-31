package xxl.job.admin.util;

import java.util.*;

public class LongestSubsequence {

    public static void main(String[] args) {
        int[] num={10,-11,8,-1,-14,-5,7,15,7,-2,14,5,-3,-9,12,-9};
        int i = longestSubsequence(num, -2);
        System.out.println(i);
    }

    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> mapSet=new HashMap<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int arri = arr[i];
            Integer kes=(arri-difference);
            Integer val = mapSet.get(kes);
            if(val==null){
                val=0;
            }
            mapSet.put(arri,val+1);
            ans=Math.max(ans,mapSet.get(arri));
        }
        return ans;
    }




}
