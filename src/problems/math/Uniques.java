package problems.math;

import java.util.HashSet;
import java.util.Set;

public class Uniques {

    public static void main(String[] args) {
        int[] arr = {1,1,2,8,9,8,9,4,5,8};

        Set<Integer> set = new HashSet <>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        for(int i : set){
            System.out.println(i);
        }
    }
}
