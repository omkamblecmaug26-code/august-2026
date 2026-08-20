public class Problem3 {

  static void printEvenNumber(){
    int num= 1;
    while(num<=50){
      if(num%2==0){
        System.out.print(num + " ");

        num++;
      }
      num++;
    }

  }
  public static void main(String[] args) {
      printEvenNumber();
  }
}