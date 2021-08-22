package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");

		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		
		System.out.println(customerLee.showCustomerInfo() + price);

		VIPCustomer vipCustomerKim = new VIPCustomer();

		System.out.println(vipCustomerKim.showCustomerInfo());

		vipCustomerKim.setCustomerId(10020);
		vipCustomerKim.setCustomerName("김유신");
		vipCustomerKim.bonusPoint = 10000;
		price = vipCustomerKim.calcPrice(1000);

		System.out.println(vipCustomerKim.showCustomerInfo() + price);
		
		/*
		 * 형변환 대입(upcasting, downcasting)과 Overridde 메서드 관계
		 */
		Customer vc = new VIPCustomer(10070, "모네");

		System.out.println(vc.calcPrice(1000));

	}

}
