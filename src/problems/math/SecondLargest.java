package problems.math;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {22, 44, 888, 11, 6, 55, 2, 88888};
        int secondLargest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                if(arr[i-1] > secondLargest){
                    secondLargest = arr[i-1];
                    arr[i] = arr[i-1];
                }
            }else{
                if(arr[i] > secondLargest){
                    secondLargest = arr[i];
                }
            }
        }
        System.out.println(secondLargest);
    }
}
