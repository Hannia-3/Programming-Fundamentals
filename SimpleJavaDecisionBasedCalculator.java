import java.util.Scanner;

public class SimpleJavaDecisionBasedCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String operation;

    do {
      System.out.println("Enter an operation (+, -, *, /, or exit):");
      operation = scanner.nextLine();

      if (operation.equalsIgnoreCase("exit")) {
         System.out.println("Program terminated.");
         break;
      }

      if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
         System.out.println("Invalid operation. Please enter valid operation.");
         continue;
      }

      System.out.println("Enter first number:");
      double num1 = scanner.nextDouble();
      System.out.println("Enter second number:");
      double num2 = scanner.nextDouble();
      scanner.nextLine();

      double result = 0;
      boolean error = false;

      switch (operation) {
          case "+":
              result = num1 + num2;
              break;
          case "-":
              result = num1 - num2;
              break;
          case "*":
              result = num1 * num2;
              break;
          case "/":
              if (num2 == 0) {
                  System.out.println("Error: Division by zero.");
                  error = true;
              } else {
                  result = num1/num2;
              }
              break;
      }

      if (!error) {
          System.out.println("Result: " + result);
      }
  } while (true);
  scanner.close();
  }
}
