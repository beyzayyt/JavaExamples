package demo;

class Student {
    String name;
    String surname;
    Integer number;

    public Student(String name, String surname, Integer number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " " + this.number;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Student o1 = new Student("beyza", "yesilurt", 123);
        System.out.println(o1.toString());
    }
}