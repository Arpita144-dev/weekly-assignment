import java.util.*;
public class Temp{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = sc.nextInt();
        int tempf = (temp*9/5)+32;
        System.out.println("the temperature in farenhiet is:"+tempf);
        sc.close();
    }
}