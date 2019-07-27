package lesson11homework;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        API[] apis;
        Room room1 = new Room(4124, 100, 3, new Date(), "Plaza", "Kiev");
        Room room2 = new Room(234156, 150, 3, new Date(), "Plaza", "Kiev");
        Room room3 = new Room(25353, 100, 4, new Date(), "Plaza", "Kiev");
        Room room4 = new Room(678, 5000, 2, new Date(), "Plaza", "Kiev");
        Room room5= new Room(678, 5000, 2, new Date(), null, "Kiev");
        Room room6 = new Room(678, 5000, 2, new Date(), "Plaza", null);
        Room[] rooms1 = {room1, room2, room3, room4, room5, room6};
        Room[] rooms2 = null;
        Room[] rooms3 = {room5, room6};

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

