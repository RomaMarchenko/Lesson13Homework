package lesson10homework;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
            if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр" || getShipFromCity() == "Харьков") {
                if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр" || getShipToCity() == "Харьков") {
                    if (getBasePrice() >= 100) {
                        if (getCustomerOwned().getGender() == "Женский") {
                            setDateConfirmed(new Date());
                        }
                    }
                }
            }
    }

    @Override
    public void calculatePrice() {
        if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
            double shippedPrice = getBasePrice() * 0.1;
            setTotalPrice(shippedPrice + getBasePrice());
            if (getBasePrice() > 1000) {
                setTotalPrice(shippedPrice + getBasePrice() - (shippedPrice + getBasePrice()) * 0.05);
            }
        } else {
            double shippedPrice = getBasePrice() * 0.15;
            setTotalPrice(shippedPrice + getBasePrice());
            if (getBasePrice() > 1000) {
                setTotalPrice(shippedPrice + getBasePrice() - (shippedPrice + getBasePrice()) * 0.05);
            }

        }
    }
}