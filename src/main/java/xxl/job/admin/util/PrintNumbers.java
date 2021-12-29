package xxl.job.admin.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNumbers {

    public static void main(String[] args) {
        int[] ints = printNumbers(1);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]);
        }
    }

    public static int[] printNumbers(int n) {
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<n;i++){
            stringBuilder.append("9");
        }
        Integer maxNumber = Integer.valueOf(stringBuilder.toString());
        int[] nums=new int[maxNumber];
        for(int i=0;i<maxNumber;i++){
            nums[i]=i;
        }
        return nums;
    }
}
