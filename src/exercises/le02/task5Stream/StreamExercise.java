package exercises.le02.task5Stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Stefan", LocalDate.of(1971, Month.MAY, 20)),
                new Person("Micha", LocalDate.of(1971, Month.FEBRUARY, 7)),
                new Person("Andi Muster", LocalDate.of(1968, Month.JULY, 17)),
                new Person("Marc Steffen", LocalDate.of(1970, Month.JULY, 17)),
                new Person("Merten", LocalDate.of(1975, Month.JUNE, 14)));

        persons.forEach(p -> System.out.println(p));
        System.out.println();


        String list = persons.stream()
                .filter(p -> p.getBirthday().getMonth() == Month.JULY)
                .map(p -> p.getName() + " " + p.getBirthday())
                .collect(Collectors.joining(", "));
        System.out.println("Geburtstag im July");
        System.out.println(list);

        String list2 = persons.stream()
                .filter(p -> p.getBirthday().getMonth() == Month.JULY)
                .map(p -> p.getName() + " " + p.getBirthday())
                .reduce("", (str1, str2) -> {
                    if (str1.isEmpty()) {return str2; }
                    else {return str1 + ", " +str2; }
                });
        System.out.println();
        System.out.println(list2);

    }
}

class Person {
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
