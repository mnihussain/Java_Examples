package problems.string;

/*

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original
letters exactly once.
Given an array of strings "words", group the anagrams together. You can return the answer in any order.

Input words = ["cat", "listen", "silent", "kitten", "salient", "act","tac", "cct", "hello", "olleh","ooleh"]
Output : [['silent', 'listen'], ['cat',"act", "tac"], ['kitten'], ['salient'],["hello","olleh"], ["ooleh"]]

Write sample test cases for same
*/

/*
["cat","tcc","act","tac", "cct"]
[["cat","act","tac"], ["tcc", "cct"]]
*/

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String[] arr = {"cat", "listen", "silent", "kitten", "salient", "act","tac", "cct", "hello", "olleh","ooleh"};
        anagramFinder(arr);

        // some input with anagram
        // some input with no match anagram ['cat', 'done', 'may']
        // empty array []
        //
        // one index array ['cat']
        // [cat1, cat2, cat3, tac1, tac2, can$0, nac0$]
        // [123, 321, 555, 567, 557]
        // [{{,}}, )},(,)}]
    }

    static void anagramFinder(String[] words) {
        String allString = "";
        for (int i = 0; i < words.length; i++) {
            char[] arr1 = words[i].toCharArray(); //['c','a','t']
            String anagram = "";
            for (int j = i + 1; j < words.length; j++) {
                if (arr1.length == words[j].length()) {
                    char[] arr2 = words[j].toCharArray(); //['a', 'c', 't']
                    Arrays.sort(arr1);
                    //System.out.println("i : " +i+" >> "+arr1.toString());
                    Arrays.sort(arr2);
                    //System.out.println(arr2);
                    //System.out.println(Arrays.equals(arr1, arr2));
                    if (Arrays.equals(arr1, arr2)) {
                        if(! allString.contains(words[i]) && ! allString.contains(words[j])) {
                            anagram = words[i] + "," + words[j] + "," + anagram;
                            allString = allString + words[i] + " " + words[j] + " ";
                        }else if(allString.contains(words[i]) && ! allString.contains(words[j])){
                            anagram = words[j] + "," + anagram;
                            allString = allString + words[j] + " ";
                        }else if(! allString.contains(words[i]) && allString.contains(words[j])){
                            anagram = words[i] + "," + anagram;
                            allString = allString + words[i] + " ";
                        }
                        System.out.println("All Strings : " + allString);
                    }
                }
            }
            if(anagram.trim().length() != 0){
                System.out.println(anagram);
            }else if(!allString.contains(words[i])){
                System.out.println(words[i]);
            }
        }
    }
}
/*
Test Cases :

*/
