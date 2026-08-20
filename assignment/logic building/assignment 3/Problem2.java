import java.util.Scanner;

public class Problem2 {
  static void checkAgeCategory(int age) {
    if(age>60){
      System.out.println("You are a senior citizen.");
    }
    else if(age>18) {
      System.out.println("You are an adult.");
    }
    else {
      System.out.println("you are a minor.");
    }
  }
  public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
    System.out.print("Enter your age: ");

    int age = sc.nextInt();

    checkAgeCategory(age);
   
  }
}