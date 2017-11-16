package Task20;

public class Crocodile extends Wild {

    private static boolean isPredator = true;

    public Crocodile(int age, double weight, String colour) {
        super(age, weight, colour, isPredator);
    }

    @Override
    public String see() {
        String s = "I see world in orange";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Crocodile) {
            if (((Crocodile) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
