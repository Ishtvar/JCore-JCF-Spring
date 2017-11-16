package Task20;

public class Fish extends Domestic {

    public Fish(int age, double weight, String colour, String name) {
        super(age, weight, colour, name);
    }

    @Override
    public String say() {
        String s = " ... ";
        return s;
    }

    @Override
    public String see() {
        String s = "I see world in green";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName() + " - " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fish) {
            if (((Fish) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
