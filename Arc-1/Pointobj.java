import java.awt.*;
public class Pointobj {

        //pointer
        public static void main(String[] args) {
            //reference type can connected by memory location like pointer
            Point point1=new Point(1,1);
            Point point2=point1;
            System.out.println("before:"+point2);
            point1.x=5;
            System.out.println("after :"+point2);
            //primitive type cant share memory location like reference type.
//    byte x=1;
//    byte y=x;
//    x=2;
//        System.out.println(y);//y=1
        }
    }
