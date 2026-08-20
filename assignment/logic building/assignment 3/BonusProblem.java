import java.util.Scanner;

  class Test {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    void identifyDefaultValues() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
public class BonusProblem1 {

  static void gradingSystem() {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter maths marks: ");
      int maths = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter science marks: ");
      int science = sc.nextInt();
      sc.nextLine();
      System.out.print("Enter history marks: ");
      int history = sc.nextInt();

       double avg = (maths + science + history) /3;
    
      if(avg>=90){
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: A");
      }
      else if(avg>=70 && avg<=89){
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: B");
      }
      else if(avg>=50 && avg<=69){
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: C");
      }
      else if(avg>=30 && avg<=49){
        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: D");
      }
      else{
        System.out.println("Average Marks: " + avg);
      }
  }

  static void leapYear(){

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the year: ");
      int year = sc.nextInt();

      if((year%4==0 && year%100!=0) || (year%400 == 0)) {
        System.out.println(year + " is a leap year");
      }
      else {
        System.out.println(year + " is not a leap year");
      }
  }

  static void weekDay(){

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter day Nuber: ");
      int day_number = sc.nextInt();

      if(day_number == 1){
        System.out.println("The day is Monday");
      }
      else if(day_number == 2){
        System.out.println("The day is Tuesday");
      }
      else if(day_number == 3){
        System.out.println("The day is Wednesday");
      } 
      else if(day_number == 4){
        System.out.println("The day is Thursday");
      } 
      else if(day_number == 5){
        System.out.println("The day is Friday");
      } 
      else if(day_number == 6){
        System.out.println("The day is Saturday");
      } 
      else if(day_number == 7){
        System.out.println("The day is Sunday");
      }
      else {
        System.out.println("Invalid day number");  
      } 
  }

public static void main(String[] args) {
  boolean isWorking = true;

  while(isWorking){
    Scanner sc = new Scanner(System.in);
    System.out.println("Menu-driven Problema");
    System.out.println("Press 1 for Checking Grades");
    System.out.println("Press 2 for Checking Leap year");
    System.out.println("Press 3 for Checking Day of the week");
    System.out.println("Press 4 for to identify default values of all vairble");
    System.out.println("Press 5 to Exit");
    System.out.print("Enter the number: ");
    int pressNum = sc.nextInt();

    switch (pressNum) {
        case (1):

            gradingSystem();
            break;
        case(2):
            leapYear();
            break;
        case(3):
            weekDay();
            break;
        case(4):
            Test value = new Test();
            value.identifyDefaultValues();  
            break;
        case(5):
            isWorking = false;
            break;

        default:
            System.out.println("Invalid Input");
      }
  }

    
}
  

}