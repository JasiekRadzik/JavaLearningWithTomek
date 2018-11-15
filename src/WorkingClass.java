import housetraining.Furniture;
import housetraining.House;
import housetraining.HouseOwner;
import housetraining.Room;

public class WorkingClass implements GeneralTest {

    @Override
    public void run() {
        House house = new House();

        HouseOwner owner = new HouseOwner("Tomek", 1);

        house.addOwner(owner);

        Room room1 = new Room("Kitchen", 1);

        Furniture furniture1 = new Furniture("Krzeslo", 1);
        Furniture furniture2 = new Furniture("Fotel", 2);
        Furniture furniture3 = new Furniture("Stół", 3);

        room1.putFurniture(furniture1);
        room1.putFurnitures(new Furniture[]{furniture2, furniture3});

        Room room2 = new Room("Bathroom", 2);

        Furniture furniture4 = new Furniture("Wanna", 4);
        Furniture furniture5 = new Furniture("Umywalka", 5);
        Furniture furniture6 = new Furniture("Lustro", 6);

        room2.putFurnitures(new Furniture[]{furniture4, furniture5, furniture6});


        Room room3 = new Room("Living housetraining.Room", 3);

        Furniture furniture7 = new Furniture("Pufa", 7);
        Furniture furniture8 = new Furniture("Telewizor", 8);
        Furniture furniture9 = new Furniture("PlayStation", 9);

        room3.putFurnitures(new Furniture[]{furniture7, furniture8, furniture9});

        house.addRoom(room1);
        house.addRoom(room2);
        house.addRoom(room3);

        System.out.println(house.toString());
    }
}
