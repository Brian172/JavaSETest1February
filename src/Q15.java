import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size.");
        int arrSize = sc.nextInt();

        int odds = 0;
        int evens = 0;

        int number[]= new int[arrSize];

        System.out.println("Enter your values.");

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1) {
                odds++;
            } else {
                evens++;
            }
        }

        System.out.println("There are " + odds + " odd numbers and " + evens + " even numbers");

    }
}
