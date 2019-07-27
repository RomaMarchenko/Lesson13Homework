package lesson11homework;

public class Controller {
    private API[] APIS;



    public Controller(API[] APIS) {
        this.APIS = APIS;
    }

    public API[] getAPIS() {
        return APIS;
    }

    private int countRooms(int price, int persons, String city, String hotel){
        int index = 0;
        int maxIndex = 0;
        for(API api : APIS) {
            if (api != null) {
                for (Rooms rooms : api.findRooms(price, persons, city, hotel)) {
                    if (rooms != null) {
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


    public Rooms[] requestRooms(int price, int persons, String city, String hotel){
        Rooms[] wantedRooms = new Rooms[countRooms(price, persons, city, hotel)];
        int index = 0;
        for(API api : APIS){
            if(api != null) {
                for(Rooms rooms : api.findRooms(price, persons, city, hotel)){
                    if(rooms != null) {
                        wantedRooms[index] = rooms;
                        index++;
                    }
                }
            }
            index = 0;
        }

        return wantedRooms;
    }

    private int countSameRooms(API API1, API API2){
        int index = 0;
        for(Rooms rooms1 : API1.getAll()){
            if(rooms1 !=  null){
                for(Rooms rooms2 : API2.getAll()){
                    if(rooms1.getPrice() == rooms2.getPrice() && rooms1.getPersons() == rooms2.getPersons() && rooms1.getCityName() == rooms2.getCityName() && rooms1.getHotelName() == rooms2.getHotelName()){
                        index++;
                    }
                }
            }
        }
        return index;
    }

    public Rooms[] check(API API1, API API2){
        Rooms[] sameRooms = new Rooms[countSameRooms(API1, API2)];
        int index = 0;
        for(Rooms rooms1 : API1.getAll()){
            if(rooms1 !=  null){
                for(Rooms rooms2 : API2.getAll()){
                    if(rooms1.getPrice() == rooms2.getPrice() && rooms1.getPersons() == rooms2.getPersons() && rooms1.getCityName() == rooms2.getCityName() && rooms1.getHotelName() == rooms2.getHotelName()){
                        sameRooms[index] = rooms1;
                        index++;
                    }
                }
            }
        }
        return sameRooms;
    }

    private int firstRoomPrice() {
        int roomPrice = 0;
        for(API api : APIS) {
            for(Rooms rooms : api.getAll()) {
                roomPrice = rooms.getPrice();
                break;
            }
            break;
        }
        return roomPrice;
    }

    public Rooms cheapestRoom(){
        int minRoomPrice = firstRoomPrice();
        Rooms wantedCheapestRooms = null;

        for(API api : APIS) {
            for(Rooms rooms : api.getAll()){
                if(rooms != null){
                    int roomPrice = rooms.getPrice();
                    if(roomPrice < minRoomPrice) {
                        minRoomPrice = roomPrice;
                        wantedCheapestRooms = rooms;
                    }
                }
            }
        }
        return wantedCheapestRooms;
    }
}
