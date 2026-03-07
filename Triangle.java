import java.util.*;
class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 3 sides of triangle ");
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        double parameter = t1+t2+t3;
        double rounds = parameter/5.0;
        System.out.println("The number of rounds required "+rounds);
        sc.close();
    }
}