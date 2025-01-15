package yunus;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter roll no.: ");
        int rollno = input.nextInt();
        System.out.println("The Roll No. is "+ rollno);

        String name = input.nextLine();
        System.out.println(name);
    }
}
