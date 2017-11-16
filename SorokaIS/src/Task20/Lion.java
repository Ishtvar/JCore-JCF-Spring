package Task20;

public class Lion extends Wild {

    private static boolean isPredator = true;

    public Lion(int age, double weight, String colour) {
        super(age, weight, colour, isPredator);
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String see() {
        String s = "I see world in violet";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Lion) {
            if (((Lion) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
