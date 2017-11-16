package Task20;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(3, 8, "Black", "Businka", true);
        Dog dog = new Dog(1, 12.5, "Black and Brown", "Kroshka", true);
        Fish fish = new Fish(7, 0.1, "Gold", "Fishy");
        Hamster humster = new Hamster(4, 1.5, "White and Brown", "Ponchik");
        GuideDog guideDog1 = new GuideDog(10, 21, "White", "Hatiko");
        GuideDog guideDog2 = new GuideDog(1, 8, "Black", "notHatiko", false);

        Crocodile crocodile1 = new Crocodile(35, 75.5, "Green");
        Giraffe giraffe1 = new Giraffe(98, 215.8, "Yellow and Brown");
        Lion lion1 = new Lion(50, 148.2, "Yellow");
        Wolf wolf = new Wolf(34, 55.9, "Grey");

        System.out.println("My animals can eat, speak and see.");
        System.out.println();

        System.out.println("for cats:");
        allMethodsFor(cat);

        System.out.println("for crocodiles:");
        allMethodsFor(crocodile1);

        System.out.println("for dogs:");
        allMethodsFor(dog);

        System.out.println("for fishes:");
        allMethodsFor(fish);

        System.out.println("for giraffes:");
        allMethodsFor(giraffe1);

        System.out.println("for hamsters:");
        allMethodsFor(humster);

        System.out.println("for guide dogs:");
        allMethodsFor(guideDog1);

        System.out.println("for unTrained guide dogs:");
        allMethodsFor(guideDog2);

        System.out.println("for lions:");
        allMethodsFor(lion1);

        System.out.println("for wolves:");
        allMethodsFor(wolf);
    }

    private static void allMethodsFor(Animal animal) {
        System.out.println(animal.eat());
        System.out.println(voiseOfTheAnimal(animal));
        System.out.println(animal.see());
        System.out.println();
    }

    private static String voiseOfTheAnimal(Animal animal) {
        String s = animal.say();
        if (animal instanceof Domestic) {
            s += "my name is " + ((Domestic) animal).getName() + ". ";
            if (animal instanceof Cat) {
                s += "Meow. ";
            } else {
                if (animal instanceof Dog) {
                    s += "Woof. ";
                } else {
                    if (animal instanceof GuideDog) {
                        if (((GuideDog) animal).isTrained()) {
                            s += "I can take you home.";
                        } else {
                            s += "Woof. ";
                        }
                    } else {
                        if (animal instanceof Hamster) {
                        } else {
                            return s = animal.say();
                        }
                    }
                }
            }
        } else {
            s += "I am a wild animal.";
            if (((Wild) animal).isPredator()) {
                s += " And I am angry.";
            }
        }
        return s;
    }

}
