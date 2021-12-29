package xxl.job.admin.util;

public class MinimumMoves {

    public static void main(String[] args) {
        String str = "XXXOOXXX";
        int i = minimumMoves(str);
        System.out.println(i);
    }

    public static int minimumMoves(String s) {
        char[] chars = s.toCharArray();
        if (chars.length < 3) {
            return 0;
        }
        int result = 0;
        boolean flag = false;
        int step=0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar == 'X') {
                chars[i] = 'O';
                flag = true;
            }
            if(flag){
                step++;
            }
            int index = i + 1;
            if ((step==3 && flag) || (index == chars.length && flag)) {
                result += 1;
                step=0;
                flag = false;
            }
        }
        return result;
    }

}
