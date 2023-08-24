//wap to detect double and triple spaces in java
class spaces{
public static void main(String[] args) {
	String str=new String("saym hari  lal");
	String ans1=(str.indexOf("  ")==-1)?"there aren't any double spaces":"there are double spaces";
	String ans2=(str.indexOf("   ")==-1)?"there aren't any triple spaces":"there are triple spaces";
System.out.printf("%s , %s",ans1,ans2);
}
}