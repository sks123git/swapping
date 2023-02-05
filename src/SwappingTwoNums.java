import java.util.Scanner;
// Swapping two numbers
public class SwappingTwoNums {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1,num2;
        System.out.println("Kindly enter num1");
        num1 = scanner.nextInt();
        System.out.println("Kindly enter num2");
        num2 = scanner.nextInt();

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Num 1: " + num1);
        System.out.println("Num 2: " + num2);
    }
}