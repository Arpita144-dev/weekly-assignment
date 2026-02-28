import java.util.Scanner;
public class Areat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        double b = sc.nextDouble();
        System.out.println("Enter the height");
        double h = sc.nextDouble();
        double area = 0.5*b*h;
        double areaInch = area / 6.4516;
        System.out.println("Area:" + area +"cm^2");
        System.out.println("Area:" + areaInch );
        sc.close();

    }
}