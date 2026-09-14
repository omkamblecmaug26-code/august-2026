
class Complex {
    private int real;
    private int imaginary;

    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void sum(int real,int imaginary) {
        int r = this.real + real;
        int i = this.imaginary + imaginary;

        System.out.println("Sum = " + r + " + " + i + "i");
    }

    void difference(int real,int imaginary) {
        int r = this.real - real;
        int i = this.imaginary - imaginary;

        System.out.println("Difference = " + r + " + " + i + "i");
    }

    void product(int real,int imaginary) {
        int r = (this.real * real) - (this.imaginary * imaginary);
        int i = (this.real * imaginary) + (this.imaginary * real);

        System.out.println("Product = " + r + " + " + i + "i");
    }

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
    
    
}

class main {
    public static void main(String[] args) {

    		ConsoleInput c = new ConsoleInput();
        System.out.print("Enter real part of first number: ");
        int r1 = c.getInt();

        System.out.print("Enter imaginary part of first number: ");
        int i1 = c.getInt();

        System.out.print("Enter real part of second number: ");
        int r2 = c.getInt();

        System.out.print("Enter imaginary part of second number: ");
        int i2 = c.getInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        c1.sum(c2.getReal(),c2.getImaginary());
        c1.difference(c2.getReal(),c2.getImaginary());
        c1.product(c2.getReal(),c2.getImaginary());
    }
    
}

class  ConsoleInput{
	
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