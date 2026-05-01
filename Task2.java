package Lab12_Tasks;

import java.util.Scanner;

public class Task2 {
    public void calculateFactorial(Scanner sc) {
        System.out.println("Enter an Integer:");
        String str = sc.nextLine();

        try {
            if(str == null || str.trim().isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException e) {
            System.out.println("String is NULL or Empty");
            return;
        }

        int n;
        try {
            n = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            System.out.println(str + " is Not a Valid Integer");
            return;
        }

        try {
            if(n < 0) {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Integer Must Not be Negative");
            return;
        }

        long result = 1;
        try {
            for(int i=2; i<=n; i++) {
                if(result > Long.MAX_VALUE / i) {
                    throw new ArithmeticException();
                }
                result *= i;
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Input Integer is too Large");
            return;
        }

        System.out.println(n + "! = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task2 t = new Task2();
        t.calculateFactorial(sc);
    }
}
