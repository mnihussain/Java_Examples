package problems.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Integer[] array = arr.toArray(new Integer[arr.size()]);
        Arrays.sort(array);
        long minSum = 0;
        long maxSum = 0;
        for(int i = 0; i < array.length; i++){
            if(i != array.length -1){
                minSum = minSum + array[i];
            }
            if(i != 0){
                maxSum = maxSum + array[i];
            }
        }
        System.out.println(minSum +" "+maxSum);
    }

}
