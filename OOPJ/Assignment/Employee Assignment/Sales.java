
class Sales extends Employee{

	private double commission;
	
	public Sales(String name, String address, int age, char gender, double salary,double commission) {
		super(name, address, age, gender, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Override
	String getRole() {
		return "Sales";
	}

}
