package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();

		Customer customerT = new Customer(10010, "Tomas");
		Customer customerI = new Customer(10020, "Iomas");
		Customer customerG = new GoldCustomer(10030, "Gomas");
		Customer customerE = new GoldCustomer(10040, "Eomas");
		Customer customerR = new VIPCustomer(10070, "Romas");

		customerList.add(customerT);
		customerList.add(customerI);
		customerList.add(customerG);
		customerList.add(customerE);
		customerList.add(customerR);

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님이 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
		}
		
		if (customerE instanceof GoldCustomer) {
			GoldCustomer gc = (GoldCustomer) customerE;
			System.out.println(gc.showCustomerInfo());
		}

	}

}
