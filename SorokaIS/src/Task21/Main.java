package Task21;

import Task20.*;

public class Main {
    public static void main(String[] args) {
        MyCollection collection1 = new MyCollection();
        MyCollection collection2 = new MyCollection();
        Crocodile crocodile1 = new Crocodile(48, 53, "green");
        Cat cat1 = new Cat(12, 15, "red", "Barsik");
        Dog dog1 = new Dog(3, 15, "green", "Tuzik");
        Fish fish1 = new Fish(1, 0.5, "gold", "Fishy");
        Giraffe giraffe1 = new Giraffe(28, 140, "Yellow&brown");
        GuideDog guideDog1 = new GuideDog(10, 16, "white", "Bob");
        Hamster hamster = new Hamster(4, 2, "white&brawn", "Fatty");
        Lion lion = new Lion(23, 150, "Yellow");
        Wolf wolf1 = new Wolf(35, 56.5, "grey");
        Giraffe giraffe2 = new Giraffe(10, 78, "dotted");


        collection1.add(giraffe1);
        collection1.add(cat1);
        collection1.add(dog1);
        collection1.add(fish1);
        collection1.add(guideDog1);
        collection1.add(hamster);
        collection1.add(giraffe2);

        collection2.add(giraffe2);
        collection2.add(crocodile1);
        collection2.add(lion);
        collection2.add(wolf1);

        System.out.println("Let's check if my collection1 contains dog1");
        if (collection1.contains(dog1)) {
            System.out.println("It contains " + dog1);
        }
        System.out.println(collection1 + " collection1");
        System.out.println();

        System.out.println("Let's remove giraffe2 from collection1");
        if (collection1.remove(giraffe2)) {
            System.out.println("removing");
        }
        System.out.println(collection1 + " collection1");
        System.out.println();

        System.out.println("Let's add collection2 to collection 1");
        System.out.println(collection1 + " collection1");
        System.out.println(collection2 + " collection2");
        if (collection1.addAll(collection2)) {
            System.out.println("done");
        }
        System.out.println(collection1 + " collection1");
        System.out.println();

        MyCollection collection3 = new MyCollection();
        collection3.addAll(collection1);

        System.out.println("Let's retain in collection3 only elements from collection2");
        System.out.println(collection3 + " collection3");
        System.out.println(collection2 + " collection2");
        System.out.println();
        if (collection3.retainAll(collection2)) {
            System.out.println("done");
        }
        System.out.println(collection3 + " collection3");
        System.out.println();

        System.out.println("Let's remove all elements of collection2 from collection1");
        System.out.println(collection1 + " collection1");
        System.out.println(collection2 + " collection2");
        if (collection1.removeAll(collection2)) {
            System.out.println("done");
        }
        System.out.println(collection1 + " collection1");
        System.out.println();

        System.out.println("Let's check if collection3 contains all elements of collection2");
        if (collection3.containsAll(collection2)) {
            System.out.println("Yes, it's true");
            System.out.println(collection3 + " collection3");
            System.out.println(collection2 + " collection2");
        }

        System.out.println("Let's clear collection3");
        collection3.clear();
        System.out.println(collection1 + " collection1");
        System.out.println(collection2 + " collection2");
        System.out.println(collection3 + " collection3");
    }
}
