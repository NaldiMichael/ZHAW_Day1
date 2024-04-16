package exercises.le02.objectsort;

public class Person implements Comparable<Person>{
    private String name;
    private int alter;
    public Person (String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return alter;
    }

    public void setAge(int alter) {
        this.alter = alter;
    }

    public int compareTo(Person o) {
        if ((this.alter - o.alter) == 0) {
            return this.name.compareTo(o.name);
        }
        return this.alter - o.alter;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "name=" + name +
                ", alter=" + alter +
                '}';
    }
}
