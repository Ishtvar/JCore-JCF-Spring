package Task20;

public class Cat extends Domestic {

    public Cat(int age, double weight, String colour, String name, boolean isVaccinated) {
        super(age, weight, colour, name, isVaccinated);
    }

    public Cat(int age, double weight, String colour, String name) {
        super(age, weight, colour, name);
    }

    @Override
    public String see() {
        String s = "I see world in red";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName() + " - " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            if (((Cat) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
