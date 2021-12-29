package xxl.job.admin.util;

public class NumMatrix {
        //["NumMatrix","sumRegion","sumRegion","sumRegion"]
    //[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]

    public static void main(String[] args) {
      int[][] matrinx={{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        NumMatrix numMatrix=new NumMatrix(matrinx);
        int i = numMatrix.sumRegion(2, 1, 4, 3);
        System.out.println(i);
    }


   private  int[][] matrix = null;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public  int sumRegion(int row1, int col1, int row2, int col2) {
        if(matrix.length<=0 && matrix[0].length<=0){
            return 0;
        }

        return getSum(row1, col1, row2, col2);
    }

    private  int getSum(int row1, int col1, int row2, int col2) {
        int sum=0;
        if(row1 <= row2 && col1 <= col2){
            for(int i = row1; i<= row2; i++){
                for(int j = col1; j<= col2; j++){
                  sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }


}
