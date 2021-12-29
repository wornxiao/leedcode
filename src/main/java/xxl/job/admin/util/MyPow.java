package xxl.job.admin.util;

public class MyPow {
    public static void main(String[] args) {
        double result = myPow(2, -2147483648);
        System.out.println(result);
    }
    public static double myPow(double x, int n) {
        double result=1;
        if(n==0 ||x==1){
            return result;
        }
        if(x==-1 && n%2==0){
            return 1;
        }
        if(x==-1 && n%2!=0){
            return -1;
        }
        if(n>0){
            for(int i=n;i>0;i--){
                result=result*x;
            }
            return result;
        }
        String substring = String.valueOf(n).substring(1);
        long num=Long.valueOf(substring);
        for(long i=num;i>0;i--){
            result=result/x;
            if(result==0){
                break;
            }
        }
        return result;
    }

}
