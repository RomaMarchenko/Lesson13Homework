package lesson10homework;

import java.util.Date;

public class Furniture_Order extends Order {
    private String furnitureCode;

    public Furniture_Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }


    public void validateOrder() {
        if(getShipFromCity() == "Киев" || getShipFromCity() == "Львов") {
            if(getBasePrice() >= 500) {
                if(getCustomerOwned().getName() != "Тест") {
                    setDateConfirmed(new Date());
                }
            }
        }
    }

    public void calculatePrice() {
        if(getBasePrice() < 5000){
            setTotalPrice(getBasePrice() * 1.05);
        }
        else {
            setTotalPrice(getBasePrice() * 1.02);
        }
    }
}
