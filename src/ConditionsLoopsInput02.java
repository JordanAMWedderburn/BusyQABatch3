import java.util.Scanner;

class ConditionsLoopsInput02 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter 3 numbers:");
    int myNum1 = myObj.nextInt();
    int myNum2 = myObj.nextInt();
    int myNum3 = myObj.nextInt();
      if (myNum1 > myNum2 & myNum1 > myNum3) {
      System.out.println("The greatest number is: " + myNum1);
    } else if (myNum2 > myNum1 & myNum2 > myNum3) {
        System.out.println("The greatest number is: " + myNum2);
    } else {
        System.out.println("The greatest number is: " + myNum3);
    }
  }
}
