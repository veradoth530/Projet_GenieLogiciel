package client;
import builder.ConcreteOrderBuilder;
import builder.OrderBuilder;
import builder.OrderDirector;
import factory.FoodMarketFactory;
import factory.MarketFactory;
import order.Order;

public class TestFoodCommande {
    public static void main(String[] args) {
        MarketFactory factory = new FoodMarketFactory();
        OrderBuilder builder = new ConcreteOrderBuilder(factory);
        OrderDirector director = new OrderDirector();

        director.buildSimpleOrder(builder);
        Order commande = builder.getOrder();

        assert commande != null : "Commande nulle !";
        System.out.println("Test marché alimentation passé ✅");
        commande.print();
    }
}
