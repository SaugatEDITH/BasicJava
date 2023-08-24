class stringMethod{
public static void main(String[] args) {
	//ways to declear string
	String name1="pain";
	String name2=new String("Nagato");
	//we cant change the string but we can change it's copy and return it;
	int value=name2.length();//it will fing string length
	System.out.println(value);
	String smallName2=new String(name2.toLowerCase());//toLowerCase() it will make lower
	System.out.println(smallName2);
	String bigName2=new String(name2.toUpperCase());//toUpperCase() it will make upper
	System.out.println(bigName2);
	String trimming ="   lame   ";
	System.out.println(trimming.trim());//it will remove outer spaces
	System.out.println(name2.substring(1));//remove 0 index and print rest 
	System.out.println(name2.substring(1,3));//remove 0 index and till 2nd index
	System.out.println(name2.replace('a','o'));//replace a with o;
	System.out.println(name2.replace("Na","No"));//replace a with o;
	System.out.println(name2.startsWith("Na"));//true if string starts with Na(it return boolean)
	System.out.println(name2.endsWith("low"));//true if it's ends with low otherwise false
	System.out.println(name2.charAt(2));//give the character from given index
	System.out.println(name2.indexOf("g"));//give the index of given character if match not found it will return -1
	System.out.println(name2.indexOf("to",2));//give the index of given character and start looking from 2st or as given index 
	//in the case of this: saugat if i use indexOf it will find 1st index "a" but if i use lastIndxOf it will find 4rth index a
	System.out.println(name2.lastIndexOf("g"));//give the index of given character and (looks from end) if match not found it will return -1
	System.out.println(name2.equals("Nagato"));//compair 2 strings
	System.out.println(name2.equalsIgnoreCase("nagato"));//compair 2 strings but dont give a damn about upper or lower case.

}
}