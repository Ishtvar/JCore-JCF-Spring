package Task20;

public class Giraffe extends Wild {

    private static boolean isPredator = false;

    public Giraffe(int age, double weight, String colour) {
        super(age, weight, colour, isPredator);
    }

    @Override
    public String see() {
        String s = "I see world in blue";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Giraffe) {
            if (((Giraffe) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
