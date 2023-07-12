package practice;

import java.util.HashMap;

public class StringOccurs {

    public static void main(String[] args) {
        String s = "ole ole cole cole";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = s.length() - 1; i >= 0; i--){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            }else{
                int occurrence = map.get(s.charAt(i));
                map.put(s.charAt(i), occurrence+1);
            }
        }
        for(char key: map.keySet()){
            System.out.print(key + ":" +map.get(key) + " ");
        }
    }
}
