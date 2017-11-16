package Task20;

public class Dog extends Domestic {

    public Dog(int age, double weight, String color, String name) {
        super(age, weight, color, name);
    }

    public Dog(int age, double weight, String colour, String name, boolean isVaccinated) {
        super(age, weight, colour, name, isVaccinated);
    }

    @Override
    public String see() {
        String s = "I see world in yellow";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName() + " - " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            if (((Dog) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
