package yunus;


import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float n1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float n2 = sc.nextFloat();
        float sum = n1 + n2;
        System.out.println("Sum = " + sum);
    }
}
