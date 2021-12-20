package cagatayExample;

class Animal {
    String name;
    String color;

    void yell(){
        System.out.println("xxxxxx");
    }
}

class Dog extends Animal{
    @Override
    void yell(){
        System.out.println("Hav hav!");
    }

    @Override
    public String toString() {
        return "Dog Name: " + name + " Dog Color: " + color;
    }
}

class Bird extends Animal {
    int beakLength;

    @Override
    void yell(){
        System.out.println("Cik cik!");
    }

    void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public String toString(){
        return "Bird Name: " + name + " Bird Color: " + color + " Bird Beak Length: " + beakLength;
    }
}


public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Elephant";
        a1.color = "Grey";
        System.out.println("Animal: " + a1.name + " Color: " + a1.color);
        a1.yell();


        System.out.println("---");


        Dog d1 = new Dog();
        d1.name = "Dogo";
        d1.color = "White";
        System.out.println("Animal: " + d1.name + " Color: " + d1.color);
        d1.yell();


        System.out.println("---");


        Bird b1 = new Bird();
        b1.fly();
        b1.name = "Eagle";
        b1.color = "Black";
        b1.beakLength = 10;
        System.out.println("Animal: " + b1.name + " Color: " + b1.color + " Beak Length: " + b1.beakLength);
        b1.yell();
        System.out.println(b1);

        System.out.println("---");
        System.out.println("Polymorphism:");

        Animal d2 = new Dog();
        d2.name = "Dog X";
        d2.color = "Yellow";
        d2.yell();
        System.out.println(d2);

        Animal b2 = new Bird();

        ////////
        //  Object
        //      Animal
        //           Dog
        //           Bird
        //      Human
        //           Man
        //           Woman
        ////////
    }
}
