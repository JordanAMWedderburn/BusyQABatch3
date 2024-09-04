import java.util.Scanner;

class ConditionsLoopsInput05 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = myObj.nextInt();
    System.out.println("Enter a number for the length of the table: ");
    int num2 = myObj.nextInt();
    System.out.println("Multiplication Table of " + num);
    for (int i = 1; i <= num2; i++) {
        System.out.printf("%d * %d = %d\n", num, i, num * i);
  
   }
  }
}
