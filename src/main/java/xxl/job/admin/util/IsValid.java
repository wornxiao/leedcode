package xxl.job.admin.util;

public class IsValid {

    public static void main(String[] args) {
        String s="abccba";
        boolean valid = isValid(s);
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        if(s.length()<3){
            return false;
        }
        while(s.indexOf("abc")!=-1){
            int abc = s.indexOf("abc");
            if(abc+3<=s.length()){
                s=s.substring(0,abc)+s.substring(abc+3);
            }else{
                s=s.substring(0,abc);
            }
        }
        if(s.length()>0){
            return false;
        }
        return true;
    }
}
