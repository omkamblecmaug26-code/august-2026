public class LargestNumber {
  public static void main(String[] args) {
      int num1 = 76;
      int num2 = 54;
      int num3 = 24;
      
      if(num1>=num2) {
        if(num1>=num3){
          System.out.println(num1 + " is the largest number.");
        }
        else {
          System.out.println(num3 + " is the largest number.");
        }
      }
      else {
        if(num2>=num3){
          System.out.println(num2 + " is the largest number.");  
        }
        else {
          System.out.println(num3 +  " is the largest number");
        }
      }
  }
}
