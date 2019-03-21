package classes;

import java.util.*;

public class UniqueWords {
    String[] arr;
    Map<String, Integer> map;

    public UniqueWords(String... args) {
        map = new HashMap<>();
        arr = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }
    }

    public void calculateUniqueWords(){
        Map.Entry<String, Integer> entry;
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
    }

    public void printUniqueWords(){
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
