package ch03;

public class VIPCustomer extends Customer {

	private String agentId;
	double saleRatio;

	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

		System.out.println("VIPCustomer() call");
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	
}
