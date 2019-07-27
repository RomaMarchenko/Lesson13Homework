package lesson11homework;

public interface API {
    Rooms[] findRooms(int price, int persons, String city, String hotel);
    Rooms[] getAll();
}
