//this types of advance switch case wont work on old version of java.
//show sunday monday as the number given
import java.util.Scanner;
class sundayMonday{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choices(1-7)");
	int ch=sc.nextInt();
	switch(ch){
	case 1 -> System.out.println("Sun");
		
	case 2 -> System.out.println("Mon");
	case 3 -> System.out.println("Tue");
	case 4 -> System.out.println("Wed");

	case 5 -> System.out.println("Thu");
		
	case 6 -> System.out.println("Fri");
		
	case 7 -> System.out.println("Sat");
		
	}
}
}