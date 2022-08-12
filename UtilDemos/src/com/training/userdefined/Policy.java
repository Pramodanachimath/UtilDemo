package com.training.userdefined;

public class Policy {
	private String policyName;
	private String type;
	private String company;

	public Policy(String policyName, String type, String company) {
		super();
		this.policyName = policyName;
		this.type = type;
		this.company = company;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Policy [policyName=" + policyName + ", type=" + type + ", company=" + company + "]";
	}

}
