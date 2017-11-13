package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billing = new BillingImpl();

		// use
		String[] cart = { "324567", "4356789" };
		double total = billing.geTotalPrice(cart);
		System.out.println("Total :" + total);

		// destroy
		// ..

	}

}
