//wap to check if user entered int or not
import java.util.Scanner;

public class Int_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        boolean a=sc.hasNextInt();
        if(a==true){
            System.out.println("its number");
        }
        else{
            System.out.println("its not number Baka!");
        }
    }   
}
