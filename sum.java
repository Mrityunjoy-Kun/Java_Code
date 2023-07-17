import java.util.Scanner;

class sum {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("The value of a is: ");
        a = sc.nextInt();
        System.out.println("The value of b is: ");
        b = sc.nextInt();

        sum = a + b;
        System.out.print("Sum = " + sum);
    }
}