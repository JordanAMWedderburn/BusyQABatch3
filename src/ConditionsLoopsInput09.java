import java.util.Scanner;

class ConditionsLoopsInput09 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = myObj.nextInt();
    int fnum = num;
    int fac = 1;

    while (num !=0) {
    	fac = num * fac;
    	num--;
    	
    }
    
    System.out.println("Factorial of " + fnum + " is " + fac);
    myObj.close();
   }
  }

