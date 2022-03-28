import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static String validFirstName(String firstName) {
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

    public static String validLastName(String lastName) {
        String Q = "^[A-Z][a-z]{3,30}$";
        Pattern Q1 = Pattern.compile(Q);
        Matcher m4 = Q1.matcher(lastName);
        boolean Q3 = m4.matches();
        if (Q3) {
            System.out.println("match found");
        } else {
            System.out.println("match not found");
        }
        return lastName;
    }

    public static String validEmail(String email){

        String Email ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean matchFind = email.matches(Email);
        if (matchFind){
            System.out.println("match found");
        }
        else {
            System.out.println("match not found");
        }
        return email;
    }

}
