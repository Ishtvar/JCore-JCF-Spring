package Task20;

public class Wolf extends Wild {
    private static boolean isPredator = true;

    public Wolf(int age, double weight, String colour) {
        super(age, weight, colour, isPredator);
    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String see() {
        String s = "I see world in black";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Wolf) {
            if (((Wolf) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
