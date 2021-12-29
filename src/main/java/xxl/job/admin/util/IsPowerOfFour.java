package xxl.job.admin.util;

public class IsPowerOfFour {

    public static void main(String[] args) {
        boolean powerOfFour = isPowerOfFour(-2147483648);
        System.out.println(powerOfFour);
    }

    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        int number=getnumber(n);
        if(number==0){
            return true;
        }
        return false;
    }

   public static int getnumber(int n){
        int number=0;
        if(n>0){
            number=n%4;
        }else{
          int   num=Math.abs(n);
            num=number%4;
        }
        return number;
    }
}
