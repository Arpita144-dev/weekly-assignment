import java.util.*;
class Chocolate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of children");
        double children = sc.nextDouble();
        System.out.println("enter the number of chocolate");
        double choco = sc.nextDouble();
        double noofChoco = choco/children;
        System.out.println("no. of chocolates"+noofChoco);
        sc.close();
    }
}