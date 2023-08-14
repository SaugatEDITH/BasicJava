import java.util.Arrays;
public class arra {

        public static void main(String[] args) {
//array
            //eg
            //byte[] num=new byte[n];
            //String[] names=new String[n];
            //char[] c=new char[n]; etc.

            int[] numbers=new int[5];
            for (int i=0;i<5;i++){
                numbers[i]=i;
            }
            System.out.println(numbers);//it will show the memory address like [I@15aeb7ab
            System.out.println(Arrays.toString(numbers));//it will print the item in array [0, 1, 2, 3, 4];


            //if we already know the values we can define array like:
            int[] fruit={3,2,1,4,5};
            System.out.println(fruit.length);//unlike string length wont have() in end.
            System.out.println(fruit);
            //to sort the array
            Arrays.sort(fruit);

            System.out.println(fruit);
            System.out.println(Arrays.toString(fruit));
        }
    }

