package problems.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ListOfActors {

    public static void main(String[] args) throws IOException {
        List<List<String>> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("files/TopActors"));
        String line;
        while((line = reader.readLine()) != null){
            String[] arr = line.split(",");
            List<String> innerList = new ArrayList<>(Arrays.asList(arr));
            list.add(innerList);
        }
        topActors(list).forEach(System.out::println);
        //topActorsMap(list).entrySet().forEach(System.out::println);

    }

    public static List<List<String>> topActors(List<List<String>> A){
        List<List<String>> listOfList = new ArrayList<>();
        TreeMap<String,Integer>map = new TreeMap<>();
        for(List<String>list : A){
            if(list.size() > 1){
                if(map.containsKey(list.get(0))){
                    Integer count = map.get(list.get(0)) + 1;
                    map.put(list.get(0),count);
                }else{
                    map.put(list.get(0), 1);
                }
            }
        }

        List<Map.Entry<String,Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int limit = Math.min(10, sortedList.size());

        for(int i = 0; i < limit; i++){
            Map.Entry<String,Integer> sortedMap = sortedList.get(i);
            List<String> innerList = new ArrayList<>();
            innerList.add(sortedMap.getKey());
            innerList.add(String.valueOf(sortedMap.getValue()));
            listOfList.add(innerList);
            if(i >= 9 && i+1 < sortedList.size()){
                if(Objects.equals(sortedMap.getValue(), sortedList.get(i + 1).getValue())){
                    limit++;
                }
            }
        }

        return listOfList;
    }

//    public static Map<String,Integer> topActorsMap(List<List<String>> A){
//        Map<String,Integer> map = new LinkedHashMap<>();
//        for(List<String>list : A){
//            if(list.size() > 1){
//                if(map.containsKey(list.get(0))){
//                    Integer count = map.get(list.get(0)) + 1;
//                    map.put(list.get(0),count);
//                }else{
//                    map.put(list.get(0), 1);
//                }
//            }
//        }
//        return sortByValue(map);
//    }
//
//    public static <K,V extends Comparable<? super V>> Map<K,V> sortByValue(Map<K,V> map){
//        List<Map.Entry<K,V>> list = new ArrayList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//
//        Map<K,V> sortedMap = new LinkedHashMap<>();
//        for(Map.Entry<K,V> entry: list){
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//
//        return sortedMap;
//    }
}
