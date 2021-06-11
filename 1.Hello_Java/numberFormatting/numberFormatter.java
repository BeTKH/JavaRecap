import java.text.NumberFormat;

public class numberFormatter {
    public static void main(String[] args) {
        NumberFormat currencyValue = NumberFormat.getCurrencyInstance();
        String result = currencyValue.format(1234567.891);
        System.out.println(result);
    }
}