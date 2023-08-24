//wap to replace letter receptian name.
import java.util.*;
class letterTemp{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String letter =new String("Dear <|name|>, Thanks a lot");
	System.out.println("enter the name that you want to put");
	StringBuffer newLetter=new StringBuffer(letter.replace("<|name|>",sc.next()));
	System.out.println(newLetter);
}
}