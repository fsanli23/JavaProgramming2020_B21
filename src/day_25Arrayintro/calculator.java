package day_25Arrayintro;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter your first number");
            double n1 = scan.nextInt();
            System.out.println("math operator");
            char o = scan.next().charAt(0);
            System.out.println("enter your second number");
            double n2 = scan.nextDouble();
            switch (o) {
                case '+':
                    System.out.println("addition" + (n1 + n2));
                    break;
                case '-':
                    System.out.println("substraction" + (n1 - n2));
                    break;
                case '*':
                    System.out.println("multipication" + n1 * n2);
                    break;
                case '/':
                    System.out.println("division" + (n1 / n2));
                default:
                    System.out.println("invalid");
                    break;
            }
scan.close();
            System.out.println("would you like to continue");
            String a = scan.next().toLowerCase();

            if (a.equals("no")) {
                break;

            }
        }
    }
}
