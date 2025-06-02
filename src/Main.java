import builder.*;
import factory.*;
import market.*;
import order.Order;
import product.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            MarketFactory factory;

            System.out.println("=== Système de Commande Multi-Marché ===");
            System.out.println("1. Électronique");
            System.out.println("2. Alimentation");
            System.out.print("Choix du marché : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // consomme le saut de ligne

            if (choix == 1) {
                factory = new ElectronicsMarketFactory();
            } else if (choix == 2) {
                factory = new FoodMarketFactory(); // Ajout du marché alimentation
            } else {
                System.out.println("Marché non disponible. Fin.");
                return;
            }

            OrderBuilder builder = new ConcreteOrderBuilder(factory);
            OrderDirector director = new OrderDirector();

            System.out.print("Nom du client : ");
            String client = scanner.nextLine();

            builder.startOrder();
            builder.setClient(client);

            boolean continuer = true;
            while (continuer) {
                System.out.print("Nom du produit à ajouter : ");
                String produit = scanner.nextLine();
                builder.addProduct(produit, 1);

                System.out.print("Ajouter un autre produit ? (o/n) ");
                continuer = scanner.nextLine().equalsIgnoreCase("o");
            }

            builder.applyDiscount(0.05);
            builder.finalizeOrder();
            Order commande = builder.getOrder();

            System.out.println("\n--- Résumé de la commande ---");
            commande.print();
        }
    }
}
