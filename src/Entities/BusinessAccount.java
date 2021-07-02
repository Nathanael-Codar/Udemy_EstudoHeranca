package Entities;

public class BusinessAccount extends Account {
	private Double loandLimit;
	
	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loandLimit) {
		super(number, holder, balance);
		this.loandLimit = loandLimit;
	}

	public Double getLoandLimit() {
		return loandLimit;
	}

	public void loan(Double amount) {
		if (amount <= loandLimit ) {
			deposit(amount);
		}
	}
	
}
