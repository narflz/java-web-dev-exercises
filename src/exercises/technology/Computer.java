package exercises.technology;

public class Computer extends AbstractEntity{
    private int storage;
    private int ram;
    private boolean canPlaySkyrim;

    public Computer(int anId, int storage, int ram, boolean canPlaySkyrim) {
        super(anId);
        this.storage = storage;
        this.ram = ram;
        this.canPlaySkyrim = canPlaySkyrim;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean getCanPlaySkyrim() {
        return canPlaySkyrim;
    }

    public void adjustStorage (int storageSize) {
        this.storage = this.storage + storageSize;
    }

    public void adjustRam (int ramSize) {
        this.ram = this.ram + ramSize;
    }
}
