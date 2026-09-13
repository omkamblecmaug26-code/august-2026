
class Manager extends Employee {
	private double hra;
	public Manager(String name, String address, int age, char gender, double salary,double hra) {
		super(name, address, age, gender, salary);
		this.hra = hra;
	}
	
	
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	@Override
	String getRole() {
		return "Manager";
	}
	
}
