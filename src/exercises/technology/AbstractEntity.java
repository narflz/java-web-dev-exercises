package exercises.technology;

public abstract class AbstractEntity {
    private int id = 0;

    public AbstractEntity(int anId) {
        id = anId;
    }

    public int getId() {
        return id;
    }

    private void setId(int anId) {
        id = anId;
    }


}
