import java.util.Scanner;
class Division{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numerator");
        double n = sc.nextDouble();
        System.out.println("enter the denomintor");
        double d = sc.nextDouble();
        double ques = n/d;
        double rem = n%d;
        System.out.println("the quotient is "+ ques +"remainde is "+rem);
        sc.close();
    }
}