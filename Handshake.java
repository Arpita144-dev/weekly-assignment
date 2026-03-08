import java.util.*;
class Handshake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of students");
        int n = sc.nextInt();
        int handshake = (n*(n-1))/2;
        System.out.println("no. of handshakes is "+handshake);
        sc.close();

    }
}