package problems.math;

public class MinNumber {

    public static void main(String[] args) {
        int [] arr = {222525583, 35464714, 887525123, 225544655, 10};
        int lowest = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                lowest = arr[i];
            }else{
                arr[i] = arr[i-1];
            }
        }
        System.out.println(lowest);
    }
}
