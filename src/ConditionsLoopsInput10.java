class ConditionsLoopsInput10 {
  public static void main(String[] args) {

    int num1 = 1;
    int num2 = 1;
    int num3 = num1 + num2;

    while (num1 <= 50) {
    	System.out.print(num1 + " ");
    	num3 = num1 + num2;
    	num1 = num2;
    	num2 = num3;
    } 
    
   }
  }

