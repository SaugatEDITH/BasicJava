import java.io.*;
class character_Write{
public static void main(String[] args) {
	try{
FileWriter writer = new FileWriter("/home/sai/hawa/./char.txt");
String s="My name is pain";
writer.write(s);
System.out.println("writting is sucessful");
writer.close();
}catch(Exception e){
	System.out.println(e);

}

	try{
FileReader r = new FileReader("/home/sai/hawa/./char.txt");
int i=0;
while((i=r.read())!=-1){//important

System.out.print((char)(i));

}
// writer.close();
}catch(Exception e){
	System.out.println(e);

}

}
}

import java.io.*;

class character_Write {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/home/sai/hawa/./char.txt");
            String s = "My name is pain";
            writer.write(s);
            System.out.println("Writing is successful");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileReader r = new FileReader("/home/sai/hawa/./char.txt");
            int i = 0;
            while ((i = r.read()) != -1) { // important
                System.out.print((char) (i));
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
 