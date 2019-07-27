package lesson10homework;

public class Demo1 {
    public static void main(String[] args) {
        Customer customer = new Customer("Маша", "Днепр", "Женский");

        Electronics_Order electronicsOrder = new Electronics_Order("Phone", null, "Киев", "Днепр", 200, customer, 12);

        Electronics_Order electronicsOrder1 = new Electronics_Order("Phone", null, "Житомир", "Львов", 50, customer, 12);


        Furniture_Order furnitureOrder = new Furniture_Order("Fridge", null, "Киев", "Днепр", 1000, customer, "45266");

        Furniture_Order furnitureOrder1 = new Furniture_Order("Table", null, "Москва", "Запорожье", 10, customer, "452");

        //параметры подходят под условие +
        //параметры не подоходят под условие +
        //объект - null - ?

        electronicsOrder.validateOrder();
        electronicsOrder.calculatePrice();
        electronicsOrder.confirmShipping();

        System.out.println(electronicsOrder);

        electronicsOrder1.validateOrder();
        electronicsOrder1.calculatePrice();
        electronicsOrder1.confirmShipping();

        System.out.println(electronicsOrder1);

        //параметры подходят под условие +
        //параметры не подоходят под условие +
        //объект - null - ?


        furnitureOrder.validateOrder();
        furnitureOrder.calculatePrice();
        furnitureOrder.confirmShipping();

        System.out.println(furnitureOrder);

        furnitureOrder1.validateOrder();
        furnitureOrder1.calculatePrice();
        furnitureOrder1.confirmShipping();

        System.out.println(furnitureOrder1);

    }

}
