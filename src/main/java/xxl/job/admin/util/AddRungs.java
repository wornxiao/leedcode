package xxl.job.admin.util;


/**
 * . 新增的最少台阶数
 * 给你一个 严格递增 的整数数组 rungs ，用于表示梯子上每一台阶的 高度 。当前你正站在高度为 0 的地板上，并打算爬到最后一个台阶。
 *
 * 另给你一个整数 dist 。每次移动中，你可以到达下一个距离你当前位置（地板或台阶）不超过 dist 高度的台阶。当然，你也可以在任何正 整数 高度处插入尚不存在的新台阶。
 *
 * 返回爬到最后一阶时必须添加到梯子上的 最少 台阶数。
 *
 *
 *
 * 示例 1：
 *
 * 输入：rungs = [1,3,5,10], dist = 2
 * 输出：2
 * 解释：
 * 现在无法到达最后一阶。
 * 在高度为 7 和 8 的位置增设新的台阶，以爬上梯子。
 * 梯子在高度为 [1,3,5,7,8,10] 的位置上有台阶。
 */
public class AddRungs {
    public static void main(String[] args) {
        int rang[]={4,8,12,16};
        int step = addRungs(rang, 3);
        System.out.println(step);
    }

    public static int addRungs(int[] rungs, int dist) {
        int[] array=new int[rungs.length+1];
        if(rungs[0]!=0){
          System.arraycopy(rungs,0,array,1,rungs.length);
        }
        int numRang=0;
        for(int i=0;i<array.length;i++){
            int j=i+1;
            if(j>=array.length){
                break;
            }
            boolean bigger=array[i]+dist>=array[j];
            if(!bigger){
             int d= array[j]-array[i]-1;
             numRang+=d/dist;
            }
        }
        return numRang<0?0:numRang;
    }
}
