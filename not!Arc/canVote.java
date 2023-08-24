//check the user can vote or not
import java.util.Scanner;
class canVote{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if((sc.nextInt())>18){
		System.out.println("can vote");
	}
	else
		System.out.println("can't vote");
}
}