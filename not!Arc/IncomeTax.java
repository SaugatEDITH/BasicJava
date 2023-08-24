/*calculate incom tax paid by an employee (2.5l-5l=>5%,5l-10l=>20%,>10 =>30%)*/
import java.util.*;
class IncomeTax{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how much cash you made this year");
	double Money=sc.nextDouble();
	byte tax=(Money>=250000&&Money<500000)?(byte)5: (Money>=500000&&Money<1000000)?(byte)20:(Money>=1000000)?(byte)30:(byte)0;
	float cashYouWillPay=(float)Money*tax/100f;
	double cashLeft=Money-cashYouWillPay;
	System.out.printf("you will pay %.2f tax and you will be left with %.2f",cashYouWillPay,cashLeft);

}
}