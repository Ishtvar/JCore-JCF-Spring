package Task20;

public class GuideDog extends Domestic {

    private static boolean isVaccinated = true;
    private boolean isTrained = true;

    public GuideDog(int age, double weight, String colour, String name) {
        super(age, weight, colour, name, isVaccinated);
    }

    public GuideDog(int age, double weight, String colour, String name, boolean isTrained) {
        super(age, weight, colour, name);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String see() {
        String s = "I see world in dark-blue";
        return s;
    }

    @Override
    public String toString() {
        return this.getId() + "-" + this.getClass().getSimpleName() + " - " + this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof GuideDog) {
            if (((GuideDog) obj).getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }
}
