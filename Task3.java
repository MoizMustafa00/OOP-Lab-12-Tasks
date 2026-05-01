package Lab12_Tasks;

import java.util.Scanner;

public class Task3 {
    public void performMathOperation(Scanner sc) {
        System.out.println("Enter Number 1:");
        String str1 = sc.nextLine();
        System.out.println("Enter Number 2:");
        String str2 = sc.nextLine();
        System.out.println("Select The Mathematical Operation (+, -, *, /):");
        String op = sc.nextLine();

        try {
            if(str1 == null || str2 == null || str1.trim().isEmpty() || str2.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("Inputted Number is NULL or Empty");
            return;
        }

        double num1;
        try {
            num1 = Double.parseDouble(str1);
        } catch (NumberFormatException e) {
            System.out.println(str1 + " Contains a Non-Numeric Character");
            return;
        }

        double num2;
        try {
            num2 = Double.parseDouble(str2);
        } catch (NumberFormatException e) {
            System.out.println(str2 + " Contains a Non-Numeric Character");
            return;
        }

        try {
            if(op.equals("/")) {
                if(num2 == 0) {
                    throw new ArithmeticException();
                }
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide Number by Zero");
            return;
        }

        double result;
        switch (op) {
            case "+":
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Invalid Operator Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task3 t = new Task3();
        t.performMathOperation(sc);
    }
}
