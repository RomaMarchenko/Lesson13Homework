package lesson11homework;

import java.util.Arrays;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    private int countAcceptableRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        if(rooms != null) {
            for (Room room : rooms) {
                if (room.getCityName() == null || room.getHotelName() == null || room == null) {
                } else {
                    if ((price + 100) >= room.getPrice() && (price - 100) <= room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
                        index++;
                    }
                }
            }
        }
                return index;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
            Room[] acceptableRooms = new Room[countAcceptableRooms(price, persons, city, hotel)];
            int index = 0;
        if(rooms != null){
            for (Room room : rooms) {
                if (room.getCityName() == null || room.getHotelName() == null || room == null) {
                    System.err.println("Object has null fields or room is absent");
                } else {
                    if ((price + 100) >= room.getPrice() && (price - 100) <= room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
                        acceptableRooms[index] = room;
                        index++;
                    }
                }
            }
        }
        return acceptableRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}




