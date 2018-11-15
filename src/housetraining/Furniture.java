package housetraining;

public class Furniture {
    private int id;
    private String name;

    public Furniture(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return Furniture.class.getSimpleName() + ", name - " + name + ", id - " + id;
    }
}
