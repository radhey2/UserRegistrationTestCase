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

    public static String validPhoneNum(String phoneNo){

        String p = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
        Pattern p3 = Pattern.compile(p);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3){
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not Found");
        }
        return phoneNo;
    }

    public static String validPassWord(String p) {

        String password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        Pattern p1 = Pattern.compile(password);
        Matcher m1 = p1.matcher(p);
        boolean matchFound = m1.matches();
        if (matchFound){
            System.out.println("match Found");
        }
        else {
            System.out.println("Match Not Found");
        }

        return p;
    }



}
