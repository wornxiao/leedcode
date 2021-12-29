package xxl.job.admin.util;

import java.util.*;
import java.util.stream.Collectors;

public class MoveZeroes {
    public static void main(String[] args) {
      int[] news={0,1,0,3,12};
       // Integer[] integers = moveZeroes(news);
        Optional<Boolean> first = Arrays.stream(news).mapToObj(ele -> ele == 1).findFirst();
        if(first.isPresent()){

            System.out.println(first.get());
        }else{
            System.out.println("====");
        }
    }

    public static Integer[] moveZeroes(int[] nums) {
        int count=0;
        List<Integer> numsx=new ArrayList<>();
        for (int num : nums) {
            if(num==0){
                count++;
                continue;
            }else{
                numsx.add(num);
            }
        }

        for(int j=count;j>0;j--){
            numsx.add(0);
        }
        Integer[] arrays=new Integer[numsx.size()];
        return numsx.toArray(arrays);
    }
}
