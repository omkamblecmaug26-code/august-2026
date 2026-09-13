
public class Member {
	private String name;
	private int age;
	private double phoneNumber;
	private String adress;
	private double salary;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	void printSalart(){
		System.out.println("Salary: " + salary);
	}
	
	void display() {
	    System.out.println("-----------------------------");
	    System.out.println("Name         : " + name);
	    System.out.println("Age          : " + age);
	    System.out.println("Phone NUmber : " + phoneNumber);
	    System.out.println("Adress       : " + adress);
	    System.out.println("Salary       : " + salary);
	    System.out.println("-----------------------------");
	}
}
