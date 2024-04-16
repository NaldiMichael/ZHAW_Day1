package exercises.le02.person;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Stefan", LocalDate.of(1971, Month.MAY, 20)),
                new Person("Micha", LocalDate.of(1971, Month.FEBRUARY, 7)),
                new Person("Andi Muster" , LocalDate.of(1968, Month.JULY, 17)),
                new Person("Marc Steffen", LocalDate.of(1970, Month.JULY, 17)),
                new Person("Merten", LocalDate.of(1975, Month.JUNE, 14))
        );

        System.out.println("Stream: Filter for Birthday in July");
        Stream<Person> results = persons.stream().filter(person -> person.getBirthday().getMonth() == Month.JULY);
        List<Person> results2 = persons.stream().filter(person -> person.getBirthday().getMonth() == Month.JULY).collect(Collectors.toList());
        System.out.println(".forEach");
        results.forEach(value -> System.out.println(value));
        System.out.println("For Each Loop");
        for (Person person : results2) {
            System.out.println(person);
        }

        System.out.println("Map: Extract an attribute");

        System.out.println("Create a comma separated list");


    }


}
