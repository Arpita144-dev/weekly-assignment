import java.util.Scanner;
public class Distance{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet");
        double d = sc.nextDouble();
        Double dyard = d/3.0;
        Double dmiles = dyard/1760.0;
        System.out.println("Distance in yards is"+ dyard + "while in miles is"+dmiles);
        sc.close();
    }
}
