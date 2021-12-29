package xxl.job.admin.util;

public class IsAnagram {
    public static void main(String[] args) {
        String s="rat";
        String t="car";
        boolean anagram = isAnagram(s, t);
        System.out.print(anagram);
    }

    public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] chars = s.toCharArray();
        boolean flag=false;
        for(int i=0;i<chars.length;i++){
            char aChar = chars[i];
            int i1 = t.indexOf(aChar);
            if(i1==-1){
                flag=false;
                break;
            }
            t=t.substring(0,i1)+t.substring(i1+1);
            if(i!=i1){
                flag=true;
            }
        }
        if(flag && t.length()==0){
            return true;
        }
        return false;
    }
}
