package xxl.job.admin.util;

public class MaxPower {
    public static void main(String[] args) {
        String subString="tourist";
        int time = maxPower(subString);
        System.out.println(time);
    }


    public static int maxPower(String subString) {
        char[] chars = subString.toCharArray();
        int result=0;
        for(int i=0;i<chars.length;i++){
            int count=1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    count++;
                }else {
                    break;
                }
            }
            if(count>=result){
                result=count;
            }
        }
        return result;
    }
}
