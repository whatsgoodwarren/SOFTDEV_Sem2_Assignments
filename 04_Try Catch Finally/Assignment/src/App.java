import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter another number: ");
        int secondNumber = 0;
        
        
        int quotient = 0;
        String printQuotient = " ";
        try {
            quotient = firstNumber / secondNumber;
            printQuotient = " " + quotient;
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            printQuotient = "Undefined";
        }
    }
}
