//write a java program to find which type of TLD is entered by the user;
import java.util.*;
class typeOfDomain{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the domain");
	String domain = new String(sc.next());
	int len=domain.length();
	int index=domain.lastIndexOf(".");
	String type=domain.substring(index+1,len).toLowerCase();
	if(type.equals("com"))
		System.out.println(domain+" have the TLD which is for commercial use");
	
	else if(type.equals("edu"))
		System.out.println(domain+" have the TLD which is for Education Sector use");

	
	else if(type.equals("gov"))
		System.out.println(domain+" have the TLD which is for government Sector use");
	
	else if(type.equals("mil"))
		System.out.println(domain+" have the TLD which is for government Sector specially militery use");
	
	else if(type.equals("org"))
		System.out.println(domain+" have the TLD which is for non-profit organizations use");

	
	else if(type.equals("biz")||type.equals("co"))
		System.out.println(domain+" have the TLD which is for business and company respectively");

	
	else
		System.out.println("it may be some other type of TLD or Wrong input");	
	
	
}
}
