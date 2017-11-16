package Task20;

public abstract class Wild extends Animal {
    private boolean isPredator;

    public Wild(int age, double weight, String colour, boolean isPredator) {
        super(age, weight, colour);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }
}

