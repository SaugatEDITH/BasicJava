import java.util.Scanner;

public class ReadingUserInput {

    private static float aFloat;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter int");
        int number=sc.nextInt();
        System.out.println("enter float");
        float aFloat = sc.nextFloat();
        System.out.println("enter a double");
        double numberDouble=sc.nextDouble();
        System.out.println("enter a byte");
        byte byteNumber=sc.nextByte();
        System.out.println("enter a name str");
        String name=sc.next();
        System.out.println(number);
        System.out.println(aFloat);
        System.out.println(numberDouble);
        System.out.println(byteNumber);
        System.out.println(name);
    }
}
