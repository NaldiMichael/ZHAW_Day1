package exercises.le02.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {
    public static void main(String[] args) {
        System.out.println("Test Klasse zu Map");
        Map<String, String> map = new HashMap<>();
        map.put("Zebra", "zebra");
        map.put("haben", "has");
        map.put("sein", "be");
        map.put("Haus", "house");
        map.put("Halle", "hall");

        System.out.println("For Each Loop");
        for (String key : map.keySet()) {
            System.out.println("key + value: " + key + " & " + map.get(key));
        }

        System.out.println();
        System.out.println("forEach with Lambda");
        map.forEach((key, value) -> System.out.println("key + value: " + key + " & " + value));

        TreeMap<String, String> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);

        System.out.println();
        System.out.println("treeMap forEach with Lambda");
        treeMap.forEach((key, value) -> System.out.println("key + value: " + key + " & " + value));

        System.out.println();
        System.out.println("customTreeMap forEach with Lambda");
        TreeMap<String, String> customTreeMap = new TreeMap<>((String o1, String o2) -> -o1.toUpperCase().compareTo(o2.toUpperCase()));
        customTreeMap.putAll(map);
        customTreeMap.forEach((key, value) -> System.out.println("key + value: " + key + " & " + value));

    }
}
