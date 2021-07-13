package demo;

class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand + " " + year;
        this.model = model + " " + year;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return this.brand + " - " + this.model;
    }
}

class Person {
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setPerson(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString1() {
        return name + " " + surname + " " + age;
    }

    public String toString2() {
        return name + " " + surname;
    }
}


public class Main {
    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.name = "Beyza";
//        System.out.println(s1.name);

        Person p1 = new Person("beyza", "yesilyurt");
        Person p2 = new Person("beyza", "yesilyurt", 23);
        System.out.println(p2.toString1());
        System.out.println(p1.toString2());

       /* Car c1 = new Car("Honda", "Civic");
        System.out.println(c1.brand);
        System.out.println(c1.model);
        c1.setModel("Civic X");
        System.out.println(c1.model);

        Car c2 = new Car("Seat", "Leon", 2021);
        System.out.println(c2.brand);
        System.out.println(c2.model);

        System.out.println(c2.toString());*/
    }
}
