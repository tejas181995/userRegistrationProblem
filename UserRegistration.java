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
        return(Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", email));
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

    }
}
