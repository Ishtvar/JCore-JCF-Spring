package Task20;

public abstract class Domestic extends Animal {

    private boolean isVaccinated = false; // The owners are often irresponsible.
    private String name;

    public Domestic(int age, double weight, String colour, String name) {
        super(age, weight, colour);
        this.name = name;
    }

    public Domestic(int age, double weight, String colour, String name, boolean isVaccinated) {
        super(age, weight, colour);
        this.name = name;
        this.isVaccinated = true;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
