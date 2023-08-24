//wap to encrypt entered pin of atm eg :#####5656;
import java.util.*;
class pin_encriyption{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    
    int pin=sc.nextInt();

    String strPin=Integer.toString(pin);
    StringBuffer bufferStrPin=new StringBuffer(strPin);
   int c=strPin.length();
   if(c<=4){
   	System.out.println(pin);
   }
   else{
   	for(int i=c-5;i>=0;i--){
   		bufferStrPin.setCharAt(i,'#');
   	}
   
   System.out.println(bufferStrPin);
}
}
}