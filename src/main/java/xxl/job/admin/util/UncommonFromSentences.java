package xxl.job.admin.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UncommonFromSentences {
    public static void main(String[] args) {
        String str1="this apple is sweet";
        String str2="this apple is sour";
        String[] strings = uncommonFromSentences(str1, str2);
        Arrays.stream(strings).forEach(item->{
            System.out.println(item);
        });
    }


    public static String[] uncommonFromSentences(String s1, String s2) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(s1).append(" ").append(s2);

        String[] s = stringBuilder.toString().split(" ");
        Set<String> stringSet=new HashSet<>();

        for(int i=0;i<s.length;i++){
            String item=s[i];
            if(s1.indexOf(item)!=-1 && s2.indexOf(item)==-1){
                stringSet.add(item);
            }
            if(s1.indexOf(item)==-1 && s2.indexOf(item)!=-1){
                stringSet.add(item);
            }
        }
        String[] result=new String[stringSet.size()];
        stringSet.toArray(result);
        return result;
    }
}
