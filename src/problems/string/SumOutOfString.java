package problems.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOutOfString {

    public static void main(String[] args) {
        String input = "a10bb10de11";

        StringBuilder builder = new StringBuilder();
        int sum = 0;
        Pattern pattern = Pattern.compile("[0-9]");

        for(int i = 0; i < input.length(); i++){
            Matcher matcher = pattern.matcher(String.valueOf(input.charAt(i)));
            if(matcher.find()){
                builder.append(input.charAt(i));
            }
        }
        System.out.println(builder);

        for(int i = 1; i < builder.toString().length(); i++){
            String sub = builder.substring(i-1, i+1);
            System.out.println(sub);
            sum = sum + Integer.parseInt(sub);
            i++;
        }
        System.out.println(sum);
    }
}
