
import java.util.Scanner;

public class Problem1{
  static void sumOfTwoNumbers(int num1,int num2){
    int sum = num1 + num2;

    System.out.println("The sum of " + num1 +" and " + num2 + " is " + sum);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter First number: ");
      int num1 = sc.nextInt();
      sc.nextLine();

      System.out.println("Enter Second number: ");
      int num2 = sc.nextInt();

      sumOfTwoNumbers(num1, num2);
  }
}