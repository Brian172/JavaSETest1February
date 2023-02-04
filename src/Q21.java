import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 1;

        System.out.println("Enter range");
        int range = sc.nextInt();

        System.out.println(num1 + "\n" + num2);

        for(int i = 2; i<range; i++)
        {
            int num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
