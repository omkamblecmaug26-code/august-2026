
class ComplexNumber {
	private int number1;
	private int number2;
	
	
	public int getNumber1() {
		return number1;
	}
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	public int getNumber2() {
		return number2;
	}
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	//
	int computeComplexNumber() {
		return number1*number2;
	}
}

class Main{
	public static void main(String[] args) {
		ComplexNumber[] complexNumber = new ComplexNumber[5];
		
		for(int index =0;index<complexNumber.length;index++) {
			System.out.println("Enter real " + index + " complex number: ");
			int real = ConsoleInput.getInt();
			System.out.println("Enter Imagery " + index + " complex number: ");
			int img = ConsoleInput.getInt();
			complexNumber[index].setNumber1(real);
			complexNumber[index].setNumber2(img);
		}
		
		for(int index =0;index<complexNumber.length;index++) {
			System.out.print(complexNumber[index].getNumber1() + "* ");
			System.out.print(complexNumber[index].getNumber2() + " = ");
			complexNumber[index].computeComplexNumber();
		}
		
		
	}
}






//ConsoleInput


class ConsoleInput{
	
	public static Integer getInt() {
		int num1 = Integer.parseInt(getString());
		return num1;
	}
	
	public static char getChar() {
		String str = getString();
		char ch = str.charAt(0);
		return ch;
	}
	
	public static Float getFloat() {
		float num1 = Float.parseFloat(getString());
		return num1;
	}
	
	public static double getDouble() {
		double num1 = Double.parseDouble(getString());
		return num1;
	}
	
	public static String getString() {
		try {
		byte[] arrInput = new byte[100];
		int length = System.in.read(arrInput);
		byte[] arrFinal = new byte[length-2];
		System.arraycopy(arrInput, 0, arrFinal,0, length-2);
		
		String objString = new String(arrFinal);
		return objString;
		
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
