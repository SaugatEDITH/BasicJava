//wap to convert km to miles
import java.util.Scanner;
//program to convert km to miles
public class km_to_miles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the KM:");
        float KM = sc.nextFloat();
        float miles=KM/1.609f;
        System.out.println("miles distance is:"+miles);
    }
}
