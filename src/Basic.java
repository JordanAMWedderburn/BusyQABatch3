public class Basic {
  public static void main(String[] args) {
	  	int a = 20;
	  	int b = 10;
	  	int c = 0;
	  	int d = 4;
	  	int e = 36;
	  	int sum = d + e;
  		System.out.println("Hello");
  		System.out.println("Jordan");
  		System.out.println("Test Data: " + d + " + " + e);
  		System.out.println("Expected Output: " + sum);
  		System.out.println("Before Swap: a = " + a + " b= " + b);
  		c = a;
  		a = b;
  		b = c;
  		System.out.println("After Swap: a = " + a + " b= " + b);
		}
}