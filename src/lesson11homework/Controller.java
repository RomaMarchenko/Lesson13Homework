package lesson11homework;

public class Controller {
    private API[] apis;



    public Controller(API[] apis) {
        this.apis = apis;
    }

    public API[] getApis() {
        return apis;
    }

    private int countRooms(int price, int persons, String city, String hotel){
        int index = 0;
        int maxIndex = 0;
        for(API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    if (room != null) {
                        index++;
                        if(index > maxIndex){
                            maxIndex = index;
                        }
                    }
                }
            }
            index = 0;
        }
        return index;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel){
        Room[] wantedRooms = new Room[countRooms(price, persons, city, hotel)];
        int index = 0;
        for(API api : apis){
            if(api != null) {
                for(Room room : api.findRooms(price, persons, city, hotel)){
                    if(room != null) {
                        wantedRooms[index] = room;
                        index++;
                    }
                }
            }
            index = 0;
        }

        return wantedRooms;
    }

    private int countSameRooms(API api1, API api2){
        int index = 0;
        for(Room room1 : api1.getAll()){
            if(room1 !=  null){
                for(Room room2 : api2.getAll()){
                    if(room1.getPrice() == room2.getPrice() && room1.getPersons() == room2.getPersons() && room1.getCityName() == room2.getCityName() && room1.getHotelName() == room2.getHotelName()){
                        index++;
                    }
                }
            }
        }
        return index;
    }

    public Room[] check(API api1, API api2){
        Room[] sameRooms = new Room[countSameRooms(api1, api2)];
        int index = 0;
        for(Room room1 : api1.getAll()){
            if(room1 !=  null){
                for(Room room2 : api2.getAll()){
                    if(room1.getPrice() == room2.getPrice() && room1.getPersons() == room2.getPersons() && room1.getCityName() == room2.getCityName() && room1.getHotelName() == room2.getHotelName()){
                        sameRooms[index] = room1;
                        index++;
                    }
                }
            }
        }
        return sameRooms;
    }

    private int firstRoomPrice() {
        int roomPrice = 0;
        for(API api : apis) {
            for(Room room : api.getAll()) {
                roomPrice = room.getPrice();
                break;
            }
            break;
        }
        return roomPrice;
    }

    public Room cheapestRoom(){
        int minRoomPrice = firstRoomPrice();
        Room wantedCheapestRoom = null;

        for(API api : apis) {
            for(Room room : api.getAll()){
                if(room != null){
                    int roomPrice = room.getPrice();
                    if(roomPrice < minRoomPrice) {
                        minRoomPrice = roomPrice;
                        wantedCheapestRoom = room;
                    }
                }
            }
        }
        return wantedCheapestRoom;
    }
}
