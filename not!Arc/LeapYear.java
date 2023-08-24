//wap to find the user entered year is leap year or not
//as i find out by some google strokes are as follow.:
//divisible by 4 leap year
//divisible by 4 ! / by 100
//divisible by 100 and 400
import java.util.Scanner;
class LeapYear{
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the year: ");
	int year=sc.nextInt();
	boolean result=(year%4==0)?true:(year%4==0&&year%400!=0)?true:(year%100==0&&year%400==0)?true:false;
	if (result) {
		System.out.printf("%d is a leap year",year);
	}
	else
		System.out.printf("%d is not a leap year",year);
}
}