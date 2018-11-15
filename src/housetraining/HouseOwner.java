package housetraining;

public class HouseOwner {
    private String name;
    private int id;

    public HouseOwner(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return HouseOwner.class.getSimpleName() + " name - " + name + ", id - " + id;
    }
}
