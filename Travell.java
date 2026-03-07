 import java.util.*;
 class Travell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter from city");
        String fromCity = sc.nextLine();
        System.out.println("Enter via city");
        String viaCity = sc.nextLine();
        System.out.println("Enter to city");
        String toCity = sc.nextLine();
        System.out.println("Enter  the diatance");
        int distance = sc.nextInt();
        System.out.println("enter the time taken");
        int time = sc.nextInt();
        System.out.println("The Total Distance travelled from " + fromCity + " to " + toCity + " via " + viaCity + " is " + distance + " and the total time taken is " + time);
        sc.close();



    }
 }
