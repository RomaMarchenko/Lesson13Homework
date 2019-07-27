package lesson11homework;

public class TripAdvisorAPI implements API{
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    private int countAcceptableRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        if(rooms != null) {
            for (Room room : rooms) {
                if (room.getCityName() == null || room.getHotelName() == null) {
                } else {
                    if (room != null && price == room.getPrice() && (persons + 1) >= room.getPersons() && (persons - 1) <= room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
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
        if(rooms != null) {
            for (Room room : rooms) {
                if (room.getCityName() == null || room.getHotelName() == null || room == null) {
                    System.err.println("Object has null fields or room is absent");
                } else {
                    if (room != null && price == room.getPrice() && (persons + 1) >= room.getPersons() && (persons - 1) <= room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
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
}
