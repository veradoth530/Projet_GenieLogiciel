package console;

import factory.*;
import builder.*;
import order.Order;

public class TestCommande {
    public static void main(String[] args) {
        MarketFactory factory = new ElectronicsMarketFactory();
        OrderBuilder builder = new ConcreteOrderBuilder(factory);
        OrderDirector director = new OrderDirector();

        director.buildSimpleOrder(builder);
        Order commande = builder.getOrder();

        assert commande != null : "Commande nulle !";
        System.out.println("Test passé");
        commande.print();
    }
}
