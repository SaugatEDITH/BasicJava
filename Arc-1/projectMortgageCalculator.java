
import java.text.NumberFormat;
import java.util.Scanner;

public class projectMortgageCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount: ");
        int principal =sc.nextInt();
        System.out.println("Enter the Annual Interest Rate: ");
        float rate=(sc.nextFloat()/100/12);
        System.out.println("Enter the Time period in years: ");
        int time=sc.nextByte()*12;
        float Mortgage=(float)(principal*(rate*Math.pow((1+rate),time)/(Math.pow((1+rate),time)-1)));
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String amt=currency.format((double) Mortgage);
        System.out.printf("The Mortgage amt is: %s",amt);
    }
}
