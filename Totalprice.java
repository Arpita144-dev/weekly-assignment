import java.util.*;
class Totalprice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit price");
        int price = sc.nextInt();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        int total = price*quantity;
        System.out.println("Total price is "+ total);
        sc.close();
    }
}
