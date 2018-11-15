package housetraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Room {
    private List<Furniture> furnitures;
    private int id;
    private String type;

    public Room(String type, int id) {
        this.id = id;
        this.type = type;
    }

    public void putFurniture(Furniture furniture) {
        if (furnitures == null) {
            furnitures = new ArrayList<>();
        }
        furnitures.add(furniture);
    }

    public void putFurnitures(Furniture[] furn) {
        if (this.furnitures == null) {
            this.furnitures = new ArrayList<>();
        }

        this.furnitures.addAll(Arrays.asList(furn));
    }

    public void removeAllFurnitures() {
        if (furnitures == null) return;
        furnitures.clear();
    }

    @Override
    public String toString() {
        return Room.class.getSimpleName() + ", type - " + type + ", id - " + id + "\n, furnitures - " + furnitures + "\n";
    }
}
