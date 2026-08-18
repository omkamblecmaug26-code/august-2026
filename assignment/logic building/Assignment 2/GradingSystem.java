public class GradingSystem {
  public static void main(String[] arg) {

    int maths = 80;
    int science = 85;
    int history = 90;

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
} 
