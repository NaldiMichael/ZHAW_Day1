package exercises.le02.objectsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {
    public static void main(String[] args) {
        List<Person> persList = new ArrayList<Person>();
        persList.add(new Person("Hans1", 84));
        persList.add(new Person("Anna1", 21));
        persList.add(new Person("Stephan", 35));
        persList.add(new Person("Zora", 11));
        persList.add(new Person("Philip", 35));
        Collections.sort(persList);
        for (Person person : persList) {
            System.out.println(person.getAge() + " " + person.getName());
        }
    }
}
