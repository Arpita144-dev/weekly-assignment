import java.util.Scanner;
public class Side{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parameter");
        int p = sc.nextInt();
        int s = p/4;
        System.out.println("side of square is "+s);
        sc.close();
    }

}
