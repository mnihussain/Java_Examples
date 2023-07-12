package problems.math;

public class MaxNumber {

    public static void main(String[] args) {
        int [] arr = {222525583, 35464714, 887525123, 225544655, 10};
        int highest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > arr[i-1]){
                highest = arr[i];
            }else{
                arr[i] = arr[i-1];
            }
        }
        System.out.println(highest);
    }
}
