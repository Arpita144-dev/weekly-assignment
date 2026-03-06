import java.util.Scanner;
class TempC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int temp = sc.nextInt();
        int tempc = (temp-32)*5/9;
        System.out.println("the temperature in farenhiet is:"+tempc);
        sc.close();
    }
}
    
