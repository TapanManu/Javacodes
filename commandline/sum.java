import java.util.*;
import java.math.BigDecimal; 
class sum{
public static void main(String[] args) {
    if (args.length < 2 || !args[0].matches("\\d+[.\\d+]*")
            || !args[1].matches("\\d+[.\\d+]*")) {
        System.out.println("Plz pass 2 command line argument as numbers (0-9) only");
        return;
    }
    BigDecimal a = new BigDecimal(args[0]);
    BigDecimal b = new BigDecimal(args[1]);
    BigDecimal c = a.add(b);
    System.out.println("Sum is " + c);
}
}
