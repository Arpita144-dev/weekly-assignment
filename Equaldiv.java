public class Equaldiv {
     public static void main(String[] args) {

        int pens = 14;
        int students = 3;

        int pensPerStudent = pens / students;
        int remainingPens = pens % students;

        System.out.println("Each student will get " + pensPerStudent + " pens");
        System.out.println("Remaining pens are " + remainingPens);
    }
    
}
