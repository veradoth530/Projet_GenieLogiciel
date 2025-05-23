package order;

import java.util.ArrayList;

import marche.Product;

public class Order {
	private ArrayList<Product> listProduct = new ArrayList<Product>();
	private double prix;
	private String client;
	
	public Order() {
		
	}
	
	public void setClient(String nom) {
		this.client = nom;
	}

}
