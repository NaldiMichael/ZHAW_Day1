package exercises.le02.map;

import javax.sound.midi.Soundbank;
import java.util.*;

public class MapLoop {
    public static void main(String[] args) {
        System.out.println("Test Klasse zu Map");
        Map<String, String> map = new HashMap<>();
        map.put("Zebra", "zebra");
        map.put("haben", "has");
        map.put("sein", "be");
        map.put("Haus", "house");
        map.put("Halle", "hall");

        System.out.println("Version 1: for each loop with keySet");
        for (String key : map.keySet()) {
            System.out.println("key + value = " + key + " + " + map.get(key));
        }

        System.out.println("Version 2: for each loop with entrySet");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key + value = " + entry.getKey() + " + " + entry.getValue());
        }

        System.out.println("Version 3: streams forEach");
        map.forEach((key, value) -> System.out.println("key + value = " + key + " + " + value));

        sortMitTreeMap(map);
        sortMitCustomComparator(map);
        sortMitCustomComperatorLambda(map);

    }
    private static void sortMitTreeMap(Map<String, String> map) {
        System.out.println("Sort with TreeMap");
        Map<String, String> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (String key : treeMap.keySet()) {
            System.out.println("key + value = " + key + " + " + map.get(key));
        }
    }

    private static void sortMitCustomComparator(Map<String, String> map) {
        System.out.println("sort with custom comparator");
        TreeMap<String, String> customComparator = new TreeMap<>(new Comparator<String>() {
           public int compare(String o1, String o2) {
               return o1.toLowerCase().compareTo(o2.toLowerCase());
           }
        });
        customComparator.putAll(map);
        customComparator.forEach((key, value) -> System.out.println("key + value = " + key + " + " + value));
    }

    private static void sortMitCustomComperatorLambda(Map<String, String> map) {
        System.out.println("sort with custom comparator lambda");
        TreeMap<String, String> customComparatorLambda = new TreeMap<>((String o1, String o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()));
        customComparatorLambda.putAll(map);
        customComparatorLambda.forEach((key, value) -> System.out.println("key + value = " + key + " + " + value));
    }
}
