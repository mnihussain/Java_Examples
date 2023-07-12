package problems.string;

public class CommonPrefix {

    public static void main(String[] args) {

        String[] arr = new String[]{"apple", "ape", "april"};

        String prefix = arr[0];
        System.out.println(arr[2].indexOf(prefix));
        String p = "alle";
        System.out.println(p.indexOf("alp"));
        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        //System.out.println(prefix);
    }
}
