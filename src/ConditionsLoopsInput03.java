import java.util.Scanner;

class ConditionsLoopsInput03 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter month number (i.e 1 = January):");

        int month = myObj.nextInt();
   switch (month) {
   case 1:
	   System.out.println("This month has 31 days");
	    break;
   case 2:
	   System.out.println("This month has 28 or 29 days");
	    break;
   case 3:
	   System.out.println("This month has 31 days");
	    break;
   case 4:
	   System.out.println("This month has 30 days");
	    break;
   case 5:
	   System.out.println("This month has 31 days");
	    break;
   case 6:
	   System.out.println("This month has 30 days");
	    break;
   case 7:
	   System.out.println("This month has 31 days");
	    break;
   case 8:
	   System.out.println("This month has 31 days");
	    break;
   case 9:
	   System.out.println("This month has 30 days");
	    break;
   case 10:
	   System.out.println("This month has 31 days");
	    break;
   case 11:
	   System.out.println("This month has 30 days");
	    break;
   case 12:
	   System.out.println("This month has 31 days");
	    break;
   default:
	   System.out.println("Invalid month.");
	    break;
   }
   myObj.close();
  }
}
