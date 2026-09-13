
class Engineer extends Employee {
	private float overTime;

	public Engineer(String name, String address, int age, char gender, double salary,float overTime) {
		super(name, address, age, gender, salary);
		this.overTime = overTime;
	}

	public float getOverTime() {
		return overTime;
	}

	public void setOverTime(float overTime) {
		this.overTime = overTime;
	}
	
	@Override
	String getRole() {
		return "Engineer";
	}
}
