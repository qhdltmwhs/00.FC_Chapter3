package ch06;

public class VIPCustomer extends Customer {

	private String agentId;
	double salesRatio;

	public VIPCustomer() {
		super(0, "noname");
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer() call");
	}

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer(int, Stirng) call");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int) (price * salesRatio);
		return price;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

}
