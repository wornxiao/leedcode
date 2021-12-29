package xxl.job.admin.util;

public class SortArray {
    public static void main(String[] args) {
        int[] nums={5,2,3,1};
        int[] ints = sortArray(nums);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]);
        }
    }

    public static int[] sortArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j];
                }
            }
            nums[i] = min;
        }
        return nums;
    }
}
