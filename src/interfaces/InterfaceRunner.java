package interfaces;

import java.util.concurrent.Callable;

public class InterfaceRunner {
    public static void main(String[] args) {

        Pricable pizza = new Pizza("Neapolitana",1,20,Size.L);
        Pricable phone = new CellPhone("Apple", "XR", 1, 600);
        Pricable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Pricable del) {
        System.out.println("Delivery price " +del.calcDeliveryPrice());
        System.out.println("Order price " + del.calcOrderPrice());
    }

}
