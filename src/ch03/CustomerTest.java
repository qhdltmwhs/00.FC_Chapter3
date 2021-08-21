package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();

		customerLee.setCustomerId(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer vipCustomerKim = new VIPCustomer();

		vipCustomerKim.setCustomerId(10020);
		vipCustomerKim.setCustomerName("김유신");
		vipCustomerKim.bonusPoint = 10000;
		System.out.println(vipCustomerKim.showCustomerInfo());

	}

}
