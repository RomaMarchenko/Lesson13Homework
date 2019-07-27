package lesson9homework;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        Users users = new Users(1001, "Ann", "1w21212");
        userRepository.save(users);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(users);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //сохранение юзера +
        //сохранение того же юзера +
        //когда нет места в массиве +
        //когда сохраняем null +
        int n = 15;
        while(n > 0) {
            Users users1 = new Users(n, "Ann", "1w21212");
            System.out.println(userRepository.save(users1));
            n--;
        }

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null);

        //test update

        users = new Users(1001, "Ann", "eretertert");
        userRepository.update(users);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //обновление юзера +
        //когда нет юзера на обновлениее +
        //когда сохраняем null

        users = new Users(9999, "Ann", "eretertert");
        System.out.println(userRepository.update(users));

        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        System.out.println(userRepository.update(null));

        System.out.println(Arrays.deepToString(userRepository.getUsers()));


        //получение имён юзеров +
        //получение имени с null +

        UserRepository userRepository1 = new UserRepository();

        System.out.println(Arrays.deepToString(userRepository.getUserNames()));
        System.out.println(Arrays.deepToString(userRepository1.getUserNames()));

        //получение ид юзеров +
        //получение ид с null +

        System.out.println(Arrays.toString(userRepository.getUserIds()));
        System.out.println(Arrays.toString(userRepository1.getUserIds()));

        //получаем имя юзера по его ид +
        //вводим не существующий ид +
        //юзер = null +

        System.out.println(userRepository.getUserNameById(14));
        System.out.println(userRepository.getUserNameById(2355));
        System.out.println(userRepository1.getUserNameById(25));

        //получаем юзера по имени +
        //вводим не существующее имя +
        //юзер = null +

        System.out.println(userRepository.getUserByName("Ann"));
        System.out.println(userRepository.getUserByName("Den"));
        System.out.println(userRepository1.getUserByName("Ann"));

        //получаем юзера по ид +
        //вводим не существующий ид +
        //юзер = null +

        System.out.println(userRepository.getUserById(14));
        System.out.println(userRepository.getUserById(6346));
        System.out.println(userRepository1.getUserById(14));

        //получаем юзера по сесионному ид +
        //вводим не существующий сесионный ид +
        //юзер = null +

        System.out.println(userRepository.getUserBySessionId("eretertert"));
        System.out.println(userRepository.getUserBySessionId("125jfds"));
        System.out.println(userRepository1.getUserBySessionId("eretertert"));

        //удаление юзера по ид +
        //несуществующий ид +
        //в массиве нет юзеров +

        userRepository.delete(1001);
        userRepository.delete(76);
        userRepository1.delete(0);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        System.out.println(Arrays.deepToString(userRepository1.getUsers()));

    }
}
