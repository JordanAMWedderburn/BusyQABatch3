import java.util.Scanner;

class ConditionsLoopsInput04 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a Year: ");
    int y = myObj.nextInt();
    if (y%4==0 && y%100 !=0 || y%400 ==0)
    	   System.out.println("Leap Year");
    else
    	System.out.println("Not Leap Year");
  }
}
