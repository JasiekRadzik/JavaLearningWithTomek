package housetraining;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms;
    private HouseOwner owner;

    public House() {

    }

    public void addOwner(HouseOwner owner) {
        this.owner = owner;
    }

    public void addRoom(Room room) {
        if (rooms == null) rooms = new ArrayList<>();
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public HouseOwner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return House.class.getSimpleName() + "\n, owner - " + owner + ",\n rooms - " + rooms;
    }
}
