
abstract class Employee {
	protected String name;
	protected String address;
	protected int age;
	protected char gender;
	protected double basicSalary;
	
	public Employee(String name,String address,int age,char gender,double salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary  = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//abstract method to call role
	abstract String getRole();
	
	
	
	void display() {
		
	    System.out.println(name + " | " + address + " | " + age + " | "
	            + gender + " | " + basicSalary);
	}
	void specialDisplay() {
		System.out.println("Name\t\tAddress\t\tAge\tGender\tSalary");
	    System.out.println(name + "\t\t" + address + "\t\t" + age + "\t"
	            + gender + "\t" + basicSalary);
	}
	
	
	
}
