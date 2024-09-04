import java.util.Scanner;

class ConditionsLoopsInput08 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    int rev = 0;
    System.out.println("Enter a number: ");
    int num = myObj.nextInt();
    int fnum = num;

    while (num !=0) {
    	int digit = num % 10;
    	rev = rev * 10 + digit;
    	num /= 10;
    	
    }
    if (fnum == rev)
    	System.out.println("Palindrome");
    else
    	System.out.println("Not a palindrome"); 
   }
  }

