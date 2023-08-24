//take number of five subject and calculate percentage
import java.util.Scanner;
public class marks_percentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
System.out.println("enter the mark of sub1: ");
byte sub1=sc.nextByte();
System.out.println("enter the mark of sub2: ");
byte sub2=sc.nextByte();
System.out.println("enter the mark of sub3: ");
byte sub3=sc.nextByte();
System.out.println("enter the mark of sub4: ");
byte sub4=sc.nextByte();
System.out.println("enter the mark of sub5: ");
byte sub5=sc.nextByte();
float per=(((float)(sub1+sub2+sub3+sub4+sub5)/500)*100f);
System.out.println("percentage is :"+per);
    }
}
