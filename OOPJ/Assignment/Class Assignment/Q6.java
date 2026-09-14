class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;
    private double workHour;

    // Constructor
    Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    
    void display() {
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + salary + "\t\t" + address);
    }
    
    void getInfo(int salary, int workHour){
    		this.salary = salary;
    		this.workHour = workHour;
    }
    void addSal() {
    		if(salary<500)
    			salary+=10;
    }
    
    void addWork() {
		if(workHour<500)
			salary+=5;
}
}


