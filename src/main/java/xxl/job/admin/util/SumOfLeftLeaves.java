package xxl.job.admin.util;

public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
     return travel(root);
    }

    private int travel(TreeNode root) {
        int sum=0;
        if(root!=null){
            if(root.left==null){
                sum+=root.val;
            }else{
                sum+=travel(root.left);
            }
            if(root.right!=null){
                if(root.right.right!=null){
                    sum+=travel(root.right);
                }
            }
        }
        return sum;
    }
}


   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
