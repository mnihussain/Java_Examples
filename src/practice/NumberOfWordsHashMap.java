package practice;

import java.util.HashMap;
import java.util.Map;

public class NumberOfWordsHashMap {

    public static void main(String[] args) {
        String s = "Today is Thursday Today is also New Today";
        Map<String, Integer> map = new HashMap<>();
        String [] arr = s.split(" ");
        for (String word : arr) {
            if (map.get(word) == null) {
                map.put(word, 1);
            } else {
                int occurrence = map.get(word) + 1;
                map.put(word, occurrence);
            }
        }
        for(String key: map.keySet()){
            System.out.println(key + " <<< occurs >>> : " + map.get(key));
        }
    }
    /*
    String s = "Name name Name is Name";
    String [] arr = s.split(" ")
    HashMap<key, value> map
    key = word
    value = occur
    for(String s: arr)/ iterate through the array
    condition -
        if word already exist
        int o = how many times it occurs
        new occur = previous occur + 1
        insert into map with the new occur
        not exist
        insert word into map, occur = 1
    Iterate the map
     */
}
