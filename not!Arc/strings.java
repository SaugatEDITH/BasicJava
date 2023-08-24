import java.util.*;
class strings{
public static void main(String[] args) {
	String name=new String("apple");//or String name="apple"; string are immutable;
	int date=2003;
	System.out.println("the name is "+name+" date is "+date);//it will give nextline
	System.out.print("the name is "+name+" date is "+date);//it will give space not a next line
	System.out.printf("name is %s & date is %d\n",name,date);//same as c programming
	System.out.format("name is %s & date is %d\n",name,date);//same as c programming
	Scanner sc=new Scanner(System.in);//to take input from keyboard
	System.out.println("what's your name?");
	System.out.println("your name is "+sc.next());//user input will be taken from nside of println nextLine() if have to take input with space
	

}
}