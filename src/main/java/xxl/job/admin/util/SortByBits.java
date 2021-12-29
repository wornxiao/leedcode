package xxl.job.admin.util;

import java.util.*;

public class SortByBits {
    private static List link=new ArrayList();
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8};
        int[] ints = sortByBits(arr);
        for(int i=0;i<ints.length;i++){
            System.out.print(ints[i]);
        }
    }


    public static int[] sortByBits(int[] arr) {
        Map<Integer,List> maps=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String str = Integer.toBinaryString(arr[i]);
            int oneNumber = getOneNumber(str);
            List list = maps.get(oneNumber);
            if(list==null){
                List arrs=new ArrayList();
                arrs.add(arr[i]);
                maps.put(oneNumber,arrs);
            }else {
                list.add(arr[i]);
            }
        }

        Set<Integer> integerSet = maps.keySet();
        List li=new ArrayList(integerSet);
        Collections.sort(li);

        List result=new ArrayList();

        for(int i=0;i<li.size();i++){
            List list = maps.get(li.get(i));
            Collections.sort(list);
            result.addAll(list);
        }

        int[] finalints = result
                .stream()
                .mapToInt(k -> (int) k)
                .toArray();

        return finalints;
    }

    /**wo
     * 获取字符串中1的个数
     * @param str
     * @return
     */
    private static int getOneNumber(String str) {
        int count=0;
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='1'){
                count++;
            }
        }
        return count;
    }


}
