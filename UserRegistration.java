import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserRegistration{

	public boolean checkName(String name){
        Pattern p = Pattern.compile(name);
        return(Pattern.matches("^[A-Z]{1}[a-z]{2,15}$",name));

    }
    public boolean checkEmail(String email){
        Pattern p = Pattern.compile(email);
        return(Pattern.matches("^^(?=.*[0-9])"
        + "(?=.*[a-z])(?=.*[A-Z])"
        + "(?=.*[@#$%^&+=])"
        + "(?=\\S+$).{8,20}$";, email));
    }
    public boolean checkPhoneNumber(String Number){
        Pattern p = Pattern.compile(Number);
        return(Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}", Number));
    }
    public boolean checkPassword(String password){
        Pattern p = Pattern.compile(password);
        return(Pattern.matches("^[A-za-z0-9]{8,}$",password));
    }
    public boolean confirmValidation(boolean valid){
        if(valid){
            System.out.println("Updated");
            return true;
        }else{
            System.out.println("Enter valid Input");
        }
        return false;
    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        String firstName;
        String lastName;
        String email;
        String phoneNumber;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstName");
        firstName = sc.nextLine();
        while(!user.confirmValidation(user.checkName(firstName)))
            firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        lastName = sc.nextLine();
        while(!user.confirmValidation(user.checkName(lastName)))
            lastName = sc.nextLine();
        System.out.println("Enter E-mail");
        email = sc.nextLine();
        while(!user.confirmValidation(user.checkEmail(email)))
            email = sc.nextLine();
        System.out.println("Enter Phone Number");
        phoneNumber = sc.nextLine();
        while(!user.confirmValidation(user.checkPhoneNumber(phoneNumber)))
            phoneNumber = sc.nextLine();
        System.out.println("Enter Password");
        password = sc.nextLine();
        while(!user.confirmValidation(user.checkPassword(password)));
            password = sc.nextLine();

    }
}
