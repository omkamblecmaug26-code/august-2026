package com.employee;

import com.console.*;
import java.io.*;
import java.util.ArrayList;

import com.console.ConsoleInput;

public class Program {

	// saving in file
	static void saveEmp(Employee[] emp) {
		try (ObjectOutputStream objOutputStream = new ObjectOutputStream(new FileOutputStream("Employee.dat"))) {
			for (int index = 0; emp[index] != null; index++)
				objOutputStream.writeObject(emp[index]);
			System.out.println("Save Successfully");
		} catch (IOException e) {
			System.out.println("Erro while Saving");
		}
	}

	// loading from file
	static int loadEmp(Employee[] empArr) {
		int index = 0;
		try (ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream("Employee.dat"))) {

			while (true) {
				try {
					empArr[index] = (Employee) objInputStream.readObject();
					index++;

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Array is full");
					break;
				} catch (EOFException e) {
					System.out.println("File loaded successfully");
					break;
				}
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error while loading the file");
		}
		return index;
	}

	// adding employees Menu

	static int addEmployeeMenu(Employee[] empArr, int empCountIndex) {
		boolean status = true;
		while (status) {

			System.out.println("a. Press 1 For Manager");
			System.out.println("b. Press 2 For Engineer");
			System.out.println("c. Press 3 For Sales");
			System.out.println("d. Press 4 For Exit to Main Menu");

			int userInput = ConsoleInput.getInt();
			if (userInput > 0 && userInput <= 3)
				empCountIndex = addingEmp(empArr, empCountIndex, userInput);
			else if (userInput == 4)
				status = false;
			else
				System.out.println("Invalid Input");
		}
		return empCountIndex;
	}

	// Adding employees
	static int addingEmp(Employee[] empArr, int empCountIndex, int userInput) {
		final int ADD_MANAGER = 1;
		final int ADD_ENGINEER = 2;
		final int ADD_SALES = 3;
		switch (userInput) {
		case ADD_MANAGER:
			empArr[empCountIndex] = new Manager();
			break;
		case ADD_ENGINEER:
			empArr[empCountIndex] = new Engineer();
			break;
		case ADD_SALES:
			empArr[empCountIndex] = new Sales();
			break;
		}

		System.out.println("Enter Name: ");
		String name = ConsoleInput.getString();
		empArr[empCountIndex].setName(name);

		System.out.println("Enter Adress: ");
		String address = ConsoleInput.getString();
		empArr[empCountIndex].setAddress(address);

		System.out.println("Enter Age: ");
		int age = ConsoleInput.getInt();
		empArr[empCountIndex].setAge(age);

		System.out.println("Enter Gender: ");
		char gender = ConsoleInput.getChar();
		empArr[empCountIndex].setGender(gender);

		System.out.println("Enter Salary: ");
		double basicSalary = ConsoleInput.getDouble();
		empArr[empCountIndex].setBasicSalary(basicSalary);

		if (empArr[empCountIndex] instanceof Manager manager) {
			System.out.println("Enter HRA: ");
			float hra = ConsoleInput.getFloat();
			manager.setHra(hra);
			display(empArr, empCountIndex);
			return ++empCountIndex;

		}

		else if (empArr[empCountIndex] instanceof Engineer engineer) {
			System.out.println("Enter Overtime");
			float overtime = ConsoleInput.getFloat();
			engineer.setOverTime(overtime);
			display(empArr, empCountIndex);
			return ++empCountIndex;
		} else if (empArr[empCountIndex] instanceof Sales sales) {
			System.out.println("Enter Commission: ");
			float commission = ConsoleInput.getFloat();
			sales.setCommission(commission);
			display(empArr, empCountIndex);
			return ++empCountIndex;
		}
		return 0;
	}

	// display Menu
	static void displayMenu(Employee[] empArr, int empCountIndex) {
		boolean status = true;
		int currentEmp = 0;
		final int ALL_EMPLOYEE = 1;
		final int FIRST_EMPLOYEE = 2;
		final int NEXT_EMPLOYEE = 3;
		final int PREVIOUS_EMPLOYEE = 4;
		final int LAST_EMPLOYEE = 5;
		final int EXIT = 6;

		while (status) {

			System.out.println("a. Press 1 All Employees");
			System.out.println("b. Press 2 First Employee");
			System.out.println("c. Press 3 Next Employee");
			System.out.println("d. Press 4 Previous Employee");
			System.out.println("e. Press 5 Last Employee");
			System.out.println("d. Press 6 For Exit to Main Menu");

			int userInput = ConsoleInput.getInt();

			switch (userInput) {

			case ALL_EMPLOYEE:
				displayAll(empArr);
				break;

			case FIRST_EMPLOYEE:
				display(empArr, 0);
				currentEmp = 0;
				break;

			case NEXT_EMPLOYEE:

				currentEmp++;

				if (empArr.length == currentEmp || empArr[currentEmp] == null) {
					System.out.println("Reach the end");
					currentEmp--;
				} else
					display(empArr, currentEmp);

				break;

			case PREVIOUS_EMPLOYEE:

				currentEmp--;

				if (currentEmp < 0) {
					currentEmp = 0;
					System.out.println("Reach the first element");
				} else
					display(empArr, currentEmp);

				break;

			case LAST_EMPLOYEE:

				int lastIndex = empCountIndex - 1;

				display(empArr, lastIndex);
				currentEmp = lastIndex;
				break;

			case EXIT:
				status = false;
				break;

			default:
				System.out.println("Enter valid Input");
			}
		}
	}

	// displaying Employees
	static void display(Employee[] empArr, int currentEmp) {
		System.out.print("Name: " + empArr[currentEmp].getName() + " | " + "Age: " + empArr[currentEmp].getAge() + " | "
				+ "Adress: " + empArr[currentEmp].getAddress() + " | " + "Gender: " + empArr[currentEmp].getGender()
				+ " | " + "Salary: " + empArr[currentEmp].getBasicSalary() + " | ");

		if (empArr[currentEmp] instanceof Manager manager) {
			System.out.println("HRA: " + manager.getHra());
		}

		else if (empArr[currentEmp] instanceof Engineer engineer) {
			System.out.println("Overtime: " + engineer.getOverTime());

		} else if (empArr[currentEmp] instanceof Sales sales) {
			System.out.println("Commission: " + sales.getCommission());

		}
	}

	// displaying All by iterating through Employee Array
	static void displayAll(Employee[] empArr) {
		System.out.printf("%-20s %-5s %-25s %-8s %-15s%n", "Name", "Age", "Address", "Gender", "Basic Salary");

		for (int index = 0; empArr[index] != null; index++) {

			System.out.printf("%-20s %-5d %-25s %-8s %-15.2f%n", empArr[index].getName(), empArr[index].getAge(),
					empArr[index].getAddress(), empArr[index].getGender(), empArr[index].getBasicSalary());
		}
	}

	// sorting Menu
	static void sortMenu(Employee[] empArr, int empCountIndex) {
		boolean status = true;
		final int ALL_MANAGER = 1;
		final int ALL_ENGINEER = 2;
		final int ALL_SALES = 3;
		final int ALL_ASCENDING = 4;
		final int ALL_DESCENDING = 5;
		final int EXIT = 6;
		while (status) {
			System.out.println("a. Press 1 For All Managers");
			System.out.println("b. Press 2 For All Engineer");
			System.out.println("c. Press 3 For All Sales");
			System.out.println("c. Press 4 to sort All Employees in Alphabetic order ascending");
			System.out.println("c. Press 5 to sort All Employees in Alphabetic order descending");
			System.out.println("d. Press 6 For Exit to Main Menu");

			int userInput = ConsoleInput.getInt();

			switch (userInput) {
			case ALL_MANAGER:
				printManager(empArr);
				break;
			case ALL_ENGINEER:
				printEng(empArr);
				break;
			case ALL_SALES:
				printSales(empArr);
				break;
			case ALL_ASCENDING:
				ascending(empArr, empCountIndex);
				break;
			case ALL_DESCENDING:
				descending(empArr, empCountIndex);
				break;
			case EXIT:
				status = false;
				break;
			default:
				System.out.println("Invalid Input");
			}

		}
	}

	// Sorting in descending
	static void descending(Employee[] empArr, int empCountIndex) {
		for (int iIndex = 0; iIndex < empCountIndex - 1; iIndex++) {

			for (int oIndex = 0; oIndex < empCountIndex - 1 - iIndex; oIndex++) {
				if (empArr[oIndex].getName().compareTo(empArr[oIndex + 1].getName()) < 0) {
					Employee temp = empArr[oIndex];
					empArr[oIndex] = empArr[oIndex + 1];
					empArr[oIndex + 1] = temp;
				}
			}
		}
		displayAll(empArr);
	}

	// Sorting in ascending
	static void ascending(Employee[] empArr, int empCountIndex) {
		for (int iIndex = 0; iIndex < empCountIndex - 1; iIndex++) {

			for (int oIndex = 0; oIndex < empCountIndex - 1 - iIndex; oIndex++) {
				if (empArr[oIndex].getName().compareTo(empArr[oIndex + 1].getName()) > 0) {
					Employee temp = empArr[oIndex];
					empArr[oIndex] = empArr[oIndex + 1];
					empArr[oIndex + 1] = temp;
				}
			}
		}
		displayAll(empArr);
	}

	// Printing only engineer
	static void printEng(Employee[] empArr) {
		boolean found = false;
		for (int index = 0; (empArr[index] != null); index++) {
			if (empArr[index] instanceof Engineer) {
				displayAll(empArr);
				found = true;
			}
		}
		if (!found)
			System.out.println("No Engineer Employee in the list");
	}

	// Printing only sales
	static void printSales(Employee[] empArr) {
		boolean found = false;
		for (int index = 0; (empArr[index] != null); index++) {
			if (empArr[index] instanceof Sales) {
				displayAll(empArr);
				found = true;
			}
		}
		if (!found)
			System.out.println("No Sales in the list");
	}

	// Printing only manager
	static void printManager(Employee[] empArr) {
		boolean found = false;
		for (int index = 0; (empArr[index] != null); index++) {
			if (empArr[index] instanceof Manager) {
				displayAll(empArr);
				found = true;
			}
		}
		if (!found)
			System.out.println("No Manager in the list");
	}

	// Main function
	public static void main(String[] args) {

		final int ADD_EMP = 1;
		final int DISPLAY_EMP = 2;
		final int SORTING_EMP = 3;
		final int SAVE_EMP = 4;
		final int EXIT = 5;
		boolean status = true;
	
		Employee[] empArr = new Employee[50];
		int empCountIndex = loadEmp(empArr);

		do {

			System.out.println("--------------------------");
			System.out.println("press 1 to add the Employee");
			System.out.println("press 2 to display");
			System.out.println("press 3 for sorting");
			System.out.println("press 4 to save File");
			System.out.println("press 5 to Exit");

			int userInput = ConsoleInput.getInt();

			switch (userInput) {
			case ADD_EMP:
				empCountIndex = addEmployeeMenu(empArr, empCountIndex);
				break;

			case DISPLAY_EMP:
				if (empArr[0] == null)
					System.out.println("Employee has not created yet!");
				else
					displayMenu(empArr, empCountIndex);
				break;

			case SORTING_EMP:
				if (empArr[0] == null)
					System.out.println("Employee has not created yet!");
				else
					sortMenu(empArr, empCountIndex);
				break;
			case SAVE_EMP:
				saveEmp(empArr);
				break;
			case EXIT:
				status = false;
				break;
			default:
				System.out.println("Invalid input");
			}
		} while (status);

	}

}
