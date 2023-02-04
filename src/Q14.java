import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size.");
        int arrSize = sc.nextInt();

        int arr []= new int[arrSize];

        System.out.println("Enter your values.");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
