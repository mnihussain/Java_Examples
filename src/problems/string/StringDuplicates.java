package problems.string;

public class StringDuplicates {

    public static void main(String[] args) {
        String s = "a banana and banana or banana and apple";
        String[]arr = s.split(" ");
        StringBuilder duplicates = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i].equalsIgnoreCase(arr[j]) && ! duplicates.toString().contains(arr[i])){
                    System.out.println(arr[i]);
                    duplicates.append(" ").append(arr[i]);
                }
            }
        }
    }
}
