import java.util.Scanner;

class ConditionsLoopsInput01{
  public static void main(String[] args) {
  Scanner myObj = new Scanner(System.in);
  System.out.println("Enter a number:");
  
  int myNum = myObj.nextInt();
  
      if (myNum > 0) {
      System.out.println("The value is a positive number.");
    } else if (myNum < 0) {
      System.out.println("The value is a negative number.");
    } else {
      System.out.println("The value is 0.");
    }
      myObj.close();
  }
}
