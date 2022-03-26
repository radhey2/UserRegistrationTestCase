import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static String firstName;
    UserRegistration(String firstName){
        this.firstName = firstName;
    }
    public static String validFirstName() {
        String P = "^[A-Z][a-z]{3,30}$";
        Pattern p3 = Pattern.compile(P);
        Matcher m3 = p3.matcher(firstName);
        boolean r3 = m3.matches();
        if (r3) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
        return firstName;
    }

}
