import java.util.Scanner;
class Salary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("enter the bonus");
        int bonus = sc.nextInt();
        int totalSalary = salary +bonus;
        System.out.println("the total is:"+totalSalary);
        sc.close();
    }
}