//encrypt  or decrypt the given grade.
import java.util.Scanner;
public class grade_encryption {
    public static void main(String[] args) {
        System.out.println("enter your grade");
        Scanner sc=new Scanner(System.in);
        char grade=sc.next().toUpperCase().charAt(0);
        System.out.print("E for encryption & D for decryption: ");
        char choice=sc.next().toUpperCase().charAt(0);
        switch(choice) {
            case 'E':
            grade+=(char)8;
            break;
            case 'D':
            grade-=(char)8;
            break;
            default:
            System.out.println("kono yaro baka yaro");
        }
        System.out.printf("the grade is: %c",grade);
    }
}
