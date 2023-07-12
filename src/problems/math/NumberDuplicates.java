package problems.math;

import java.util.HashSet;
import java.util.Set;

public class NumberDuplicates {

    //int[] nums={1,3,2,3,1,1,} output    1 occurs 3 times 2- 1 time  in array  3 occurs 2 times

    public static void main(String[] args) {
        int[] arr = {1,1,2,8,9,8,9,4,5,8};

        Set<Integer> unis = new HashSet <>();

        for(int i = 0; i < arr.length; i++){
            int ind = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    ind++;
                }
            }
            if(!unis.contains(arr[i])) {
                System.out.println(arr[i] + " occurs " + ind + " times");
                unis.add(arr[i]);
            }
        }
    }
}
