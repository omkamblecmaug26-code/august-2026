import java.io.*;

public class Program {
	static void encrypt() {
		try (FileOutputStream fos = new FileOutputStream("Encrypt.txt");
			FileInputStream fis = new FileInputStream("Demo.txt")) {
			int data;
			while((data = fis.read()) != -1) {
				int encrypt = data + 12;
				fos.write(encrypt);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	static void decrypt() {
		try (FileOutputStream fos = new FileOutputStream("Decrypt.txt");
			FileInputStream fis = new FileInputStream("Encrypt.txt")) {
			int data;
			while((data = fis.read()) != -1) {
				int encrypt = data - 12;
				fos.write(encrypt);
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	static void read(String fileName) {
		try {
			FileInputStream fis = new FileInputStream(fileName);

			int data = fis.read();
			while (data != -1) {
				System.out.print((char) data);
				data = fis.read();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("Demo.txt")) {
			String name = "Om kamble";
			fos.write(name.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		encrypt();
		
		read("Encrypt.txt");
		decrypt();
		read("decrypt.txt");
		

	}

}
