package lesson11homework;

import java.util.Arrays;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        API[] APIS;
        Rooms room1 = new Rooms(4124, 100, 3, new Date(), "Plaza", "Kiev");
        Rooms room2 = new Rooms(234156, 150, 3, new Date(), "Plaza", "Kiev");
        Rooms room3 = new Rooms(25353, 100, 4, new Date(), "Plaza", "Kiev");
        Rooms rooms4 = new Rooms(678, 5000, 2, new Date(), "Plaza", "Kiev");
        Rooms rooms5 = new Rooms(678, 5000, 2, new Date(), null, "Kiev");
        Rooms rooms6 = new Rooms(678, 5000, 2, new Date(), "Plaza", null);
        Rooms[] rooms1 = {room1, room2, room3, rooms4, rooms5, rooms6};
        Rooms[] rooms2 = null;
        Rooms[] rooms3 = {rooms5, rooms6};

        BookingComAPI bookingComAPI1 = new BookingComAPI(rooms1);
        BookingComAPI bookingComAPI2 = new BookingComAPI(rooms2);
        BookingComAPI bookingComAPI3 = new BookingComAPI(rooms3);
        GoogleAPI googleAPI1 = new GoogleAPI(rooms1);
        GoogleAPI googleAPI2 = new GoogleAPI(rooms2);
        GoogleAPI googleAPI3 = new GoogleAPI(rooms3);
        TripAdvisorAPI tripAdvisorAPI1 = new TripAdvisorAPI(rooms1);
        TripAdvisorAPI tripAdvisorAPI2 = new TripAdvisorAPI(rooms2);
        TripAdvisorAPI tripAdvisorAPI3 = new TripAdvisorAPI(rooms3);


        //есть комната которая подходит под требования +
        //нет подходящей комнаты +
        //нет комнат +
        //в комнате отсутствует один из параметров город/отель +

        System.out.println(Arrays.deepToString(bookingComAPI1.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(bookingComAPI1.getAll()));
        System.out.println(Arrays.deepToString(bookingComAPI2.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(bookingComAPI2.getAll()));
        System.out.println(Arrays.deepToString(bookingComAPI3.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(bookingComAPI3.getAll()));
        System.out.println(Arrays.deepToString(googleAPI1.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(googleAPI1.getAll()));
        System.out.println(Arrays.deepToString(googleAPI2.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(googleAPI2.getAll()));
        System.out.println(Arrays.deepToString(googleAPI3.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(googleAPI3.getAll()));
        System.out.println(Arrays.deepToString(tripAdvisorAPI1.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(tripAdvisorAPI1.getAll()));
        System.out.println(Arrays.deepToString(tripAdvisorAPI2.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(tripAdvisorAPI1.getAll()));
        System.out.println(Arrays.deepToString(tripAdvisorAPI3.findRooms(100, 3, "Kiev", "Plaza")));
        System.out.println(Arrays.deepToString(tripAdvisorAPI1.getAll()));
        }
}

