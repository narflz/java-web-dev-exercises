package exercises.technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int anId, int storage, int ram, boolean canPlaySkyrim, double weight) {
        super(anId, storage, ram, canPlaySkyrim);
        this.weight = weight;
    }

    public boolean isTooHeavy() {
        if (weight > 7.5) {
            return true;
        } else {
            return false;
        }
    }
}
