package xxl.job.admin.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindSpecialInteger {
    public static void main(String[] args) {
        int [] arr={1,2,3,3};
        int specialInteger = findSpecialInteger(arr);
        System.out.println(specialInteger);
    }

    public static int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++){
            int number = arr[i];
            Integer integer = map.get(number);
            if(integer==null){
                map.put(number,1);
            }else{
                integer+=1;
                map.put(number,integer);
            }
        }

        List<Integer> collect = map.entrySet()
                .stream()
                .map(item -> {
                    Integer value = item.getValue();
                    double num=value / new Double(arr.length);
                    if ( num > 0.25) {
                        return item.getKey();
                    }
                    return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        if(collect.size()<=0){
            return 0;
        }

        return collect.get(0);
    }
}
