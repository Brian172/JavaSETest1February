import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a ;

        System.out.println("Enter your first number");
        int firstNum = sc.nextInt();

        System.out.println("Enter your second number");
        int secondNum = sc.nextInt();

        System.out.println("Before swapping- first Number = " + firstNum + " and second number = " + secondNum);

        a = firstNum;

        firstNum = secondNum;

        secondNum = a;

        System.out.println("After swapping- first Number = " + firstNum + " and second number = " + secondNum);


    }
}
