class Student {
	private String name;
	private int rollNo;
	private String adress;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}


class Program {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("John");
		s1.setRollNo(2);
		s1.setAdress("Thane");
		
		Student s2 = new Student();
		
		s2.setName("Sam");
		s2.setRollNo(3);
		s2.setAdress("Mumbai");
		
		System.out.println("Name    : " + s1.getName());
		System.out.println("Roll No : " + s1.getRollNo());
		System.out.println("Adress  : " + s1.getAdress());
		System.out.println("Name    : " + s2.getName());
		System.out.println("Roll No : " + s2.getRollNo());
		System.out.println("Adress  : " + s2.getAdress());
		
	}
}

