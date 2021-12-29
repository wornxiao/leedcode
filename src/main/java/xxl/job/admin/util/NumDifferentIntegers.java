package xxl.job.admin.util;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumDifferentIntegers {

    public static void main(String[] args) {
        String word = "a1b01c001";
        int i = numDifferentIntegers(word);
        System.out.println(i);
    }


    public static int numDifferentIntegers(String word) {
       String reg="[0-9]+";
// 创建 Pattern 对象
        Pattern r = Pattern.compile(reg);
        Set<String> set=new HashSet<String>();
        // 现在创建 matcher 对象
        Matcher m = r.matcher(word);
        while(m.find()){
            String group = m.group();
            String s = removeZero(group);
            set.add(s);
        }
        return set.size();
    }
    public static String removeZero(String str) {
        int len = str.length(), i = 0;
        while (i < len && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }
}
