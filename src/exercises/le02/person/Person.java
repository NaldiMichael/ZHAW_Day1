package exercises.le02.person;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String name;
    private LocalDate birthday;
    public Person (String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName() + " has Birthday on " +getBirthday();
    }

}
