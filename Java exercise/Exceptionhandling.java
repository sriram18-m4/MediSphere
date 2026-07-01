import java.util.*;

class ExceptionDemo {

    void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        finally {
            System.out.println("Exception Handling Completed.");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ExceptionDemo obj = new ExceptionDemo();

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        obj.divide(num1, num2);

        System.out.println("Program Ended Successfully.");

        sc.close();
    }
}
