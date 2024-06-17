import java.util.InputMismatchException;
import java.util.Scanner;

public class SID {
    public static void main(String[] args){
        StudentID();
    }

    public static void StudentID(){
        Scanner sc = new Scanner(System.in);
        int SID;
        String student[] = {"Viqi", "Shabrina", "Belva", "Celine", "Jason", "Agnes",
            "Arumi", "Trista", "Indriyani", "Nailah"};
        try {
            System.out.println("Enter SID:");
            SID = sc.nextInt();
            System.out.println(student[SID-1]); 
        } catch (Exception e) {
            if(e instanceof InputMismatchException){
                System.out.println("Input must be a number");
            }
            if(e instanceof IndexOutOfBoundsException){
                System.out.println("Student unknown");
            }
        }
    }
}
