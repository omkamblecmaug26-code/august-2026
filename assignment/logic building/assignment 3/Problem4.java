import java.util.Scanner;

public class Problem4 {

    static int askForPositiveNumber(Scanner sc) {
        int number;

        do {
            System.out.print("Enter a positive number: ");
            number = sc.nextInt();
        } while (number <= 0);

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = askForPositiveNumber(sc);

        System.out.println("You entered a positive number: " + number);

    }
}