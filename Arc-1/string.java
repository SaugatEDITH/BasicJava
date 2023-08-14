public class string {
    //string and some string method
    public static void main(String[] args) {
        String msg=new String("Hello World!");//this is old way
        String message="  Hello World!  ";//smaller better same functionality.
        System.out.println(msg+" "+message);
        System.out.println(message.endsWith("d!")+" len is:"+message.length()+" index:"+message.indexOf("e"));
        System.out.println(message.replace("Hello","Bye"));
        System.out.println(message.toLowerCase() +" "+message.toUpperCase());
        System.out.println(message.trim());


        //escape sequence
//        String name="phantom aka\"saugat\" \\saugat\\ ";
//        //print the name with "" and \\
//        System.out.println(name);

    }
}
