//David Cole
//UseTryCatch
import java.text.DecimalFormat;
public class Question5

{
    public static void main(String[] args)
    {
        double number = 5.67891234;
        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println("My formatted number is = " +
                               fmt.format(number));
    }
}


