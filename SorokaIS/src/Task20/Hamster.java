package Task20;

public class Hamster extends Domestic {

    public Hamster(int age, double weight, String colour, String name) {
        super(age, weight, colour, name);
    }

    public Hamster(int age, double weight, String colour, String name, boolean isVaccinated) {
        super(age, weight, colour, name, isVaccinated);
    }

    @Override
    public String see() {
        String s = "I see world in white";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName() + " - " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Hamster) {
            if (((Hamster) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
