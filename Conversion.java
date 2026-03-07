import java.util.*;
class Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight");
        double pound = sc.nextDouble();
        double weightKg = pound*2.2;
        System.out.println("the weight in pounds "+pound+"weight in kg is"+weightKg);
        sc.close();
    }
}