package lesson10homework;

public class Demo {
    public static void main(String[] args) {
        Customer customer = new Customer("Маша", "Днепр", "Женский");

        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Phone", null, "Киев", "Днепр", 200, customer, 12);

        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Phone", null, "Житомир", "Львов", 50, customer, 12);


        FurnitureOrder furnitureOrder = new FurnitureOrder("Fridge", null, "Киев", "Днепр", 1000, customer, "45266");

        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Table", null, "Москва", "Запорожье", 10, customer, "452");

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
