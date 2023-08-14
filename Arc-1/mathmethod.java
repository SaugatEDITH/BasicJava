public class mathmethod {
    public static void main(String[] args) {
        int num1=Math.round(1.1f);//it will make it one.
        int num2=(int)Math.ceil(1.1);//it will make it two.
        int num3=(int)Math.floor(1.1);//largest int smaller or equal to this no.
        int larg=Math.max(5,10);//its overloadable method and give largest among 2.
        int min=Math.min(5,10);//its overloadable method and give smallest among 2.
        int random=(int)(Math.random()*100);//generate random no.
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(larg);
        System.out.println(random);
    }
}
