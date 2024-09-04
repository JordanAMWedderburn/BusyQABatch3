import java.util.Scanner;

class ConditionsLoopsInput06 {
  public static void main(String[] args) {
   Scanner myObj = new Scanner(System.in);
   int count = 0;
   System.out.println("Enter a number: ");
   int num = myObj.nextInt();

    while (num != 0) {
      // num = num/10
      num /= 10;
      ++count;
    }
    System.out.println("Number of digits: " + count);
    myObj.close();
  }
  }

