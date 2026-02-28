import java.util.Scanner;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        double num1 = sc.nextDouble();
        System.out.println("Enter the number2");
        double num2 = sc.nextDouble();
        double add = num1+num2;
        double sub = num1-num2;
        double mul = num1*num2;
        double div = num1/num2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
         if(num2 != 0) {
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }
        sc.close();


    }
    
}
