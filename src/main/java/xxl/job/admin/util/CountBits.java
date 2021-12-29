package xxl.job.admin.util;

public class CountBits {
    public static void main(String[] args) {
        int[] ints = countBits(5);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }
    }

    public static int[] countBits(int n) {
        int[] result=new int[n+1];
        for(int i=0;i<=n;i++){
            String string = Integer.toBinaryString(i);
            char[] chars = string.toCharArray();
            int sum=0;
            for(int j=0;j<chars.length;j++){
                sum+=Integer.parseInt(chars[j]+"");
            }
            result[i]=sum;
        }
        return result;
    }
}
