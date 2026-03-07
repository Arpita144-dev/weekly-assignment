import java.util.*;
class Interest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal,rate,time");
        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time =sc.nextDouble();
        double interest = (principal*rate*time)/100.0;
        System.err.println("the interest is"+interest + "for Principal"+principal+"rate"+rate+"time"+time);
        sc.close();

    }
}