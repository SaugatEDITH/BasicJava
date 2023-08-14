import java.text.NumberFormat;

public class formatting_numbers {
    public static void main(String[] args) {
        // to show like $1,234,567//10%
        NumberFormat currency= NumberFormat.getCurrencyInstance();
        NumberFormat percent= NumberFormat.getPercentInstance();
        //or other method using chaining
       String per1=NumberFormat.getPercentInstance().format(0.1);
      String res=currency.format(1234567.891);
      String per= percent.format(0.52);
        System.out.println(per);
        System.out.println(per1);
        System.out.println(res);
    }
}
