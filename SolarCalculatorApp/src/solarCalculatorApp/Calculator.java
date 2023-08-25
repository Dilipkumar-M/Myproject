import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();

        int sumResult = calculator.sum(num1, num2);
        int subtractResult = calculator.subtract(num1, num2);
        int multiplyResult = calculator.multiply(num1, num2);
        int divideResult = calculator.divide(num1, num2);

        System.out.println("Sum: " + sumResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);

        scanner.close();
    }
}

