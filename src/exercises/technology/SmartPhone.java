package exercises.technology;

public class SmartPhone extends Computer {
    private boolean hasCamera;

    public SmartPhone(int anId, int storage, int ram, boolean canPlaySkyrim, boolean hasCamera) {
        super(anId, storage, ram, canPlaySkyrim);
        this.hasCamera = hasCamera;
    }

    public boolean getHasCamera() {
        return hasCamera;
    }

    public void smashCamera() {
        this.hasCamera = false;
    }
}
