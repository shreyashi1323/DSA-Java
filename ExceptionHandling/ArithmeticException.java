package ExceptionHandling;

// CUSTOM EXCEPTION AND THROW KEYWORD
class MyException extends Exception {
    // Default constructor
    public MyException() {}

    // Constructor with a message
    public MyException(String message) {
        super(message);
    }
}

// Renamed the main class to avoid conflict with built-in exceptions
public class ArithmeticException {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;

        try {
            if (num2 < 0) {
                // Throwing the custom exception when num2 is negative
                throw new MyException("negative number");
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            // Printing the exception message
            System.out.println("Enter a valid number: " + e.getMessage());
        }
    }
}
