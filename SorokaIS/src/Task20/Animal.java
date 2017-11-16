package Task20;

public abstract class Animal {

    private static int idCounter = 0;
    private int id;
    private int age;
    private double weight;
    private String colour;

    public Animal(int age, double weight, String colour) {
        this.id = nextID();
        this.age = age;
        this.weight = weight;
        this.colour = colour;
    }

    private static int nextID() {
        return ++idCounter;
    }

    public static int getIdCounter() {

        return idCounter;
    }

    public String say() {
        String speech = "Hello, ";
        return speech;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String eat() {
        String e = "I'm eating";
        return e;
    }

    public abstract String see();

}
