package edurekanew;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternChecker {

    public static void main(String[] args) {
        int denominator=0;
        try{
             System.out.println(29/denominator);
            }
        catch(ArithmeticException exception){
            System.out.println("Anyhow PRint"+exception.getMessage());
        }
        finally{
            System.out.println("Its Final BLokc");
        }
        String pattern="[a-zH]+";
        String Check="Happy Learning";
        Pattern p=Pattern.compile(pattern);
        Matcher c =p.matcher(Check);
        while(c.find())
        System.out.println(Check.substring(c.start(),c.end()));

    ;
    }
    
}
