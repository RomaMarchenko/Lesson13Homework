package lesson11homework;

public class TripAdvisorAPI implements API {
    private Rooms[] rooms;

    public TripAdvisorAPI(Rooms[] rooms) {
        this.rooms = rooms;
    }

    public Rooms[] getRooms() {
        return rooms;
    }

    private int countAcceptableRooms(int price, int persons, String city, String hotel) {
        int index = 0;
        if(rooms != null) {
            for (Rooms rooms : this.rooms) {
                if (rooms.getCityName() == null || rooms.getHotelName() == null) {
                } else {
                    if (rooms != null && price == rooms.getPrice() && (persons + 1) >= rooms.getPersons() && (persons - 1) <= rooms.getPersons() && city == rooms.getCityName() && hotel == rooms.getHotelName()) {
                        index++;
                    }
                }
            }
        }
        return index;
    }



    @Override
    public Rooms[] findRooms(int price, int persons, String city, String hotel) {
        Rooms[] acceptableRooms = new Rooms[countAcceptableRooms(price, persons, city, hotel)];
        int index = 0;
        if(rooms != null) {
            for (Rooms rooms : this.rooms) {
                if (rooms.getCityName() == null || rooms.getHotelName() == null || rooms == null) {
                    System.err.println("Object has null fields or room is absent");
                } else {
                    if (rooms != null && price == rooms.getPrice() && (persons + 1) >= rooms.getPersons() && (persons - 1) <= rooms.getPersons() && city == rooms.getCityName() && hotel == rooms.getHotelName()) {
                        acceptableRooms[index] = rooms;
                        index++;
                    }
                }
            }
        }
        return acceptableRooms;
    }

    @Override
    public Rooms[] getAll() {
        return rooms;
    }
}
