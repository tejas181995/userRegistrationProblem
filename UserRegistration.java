import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UserRegistration{

	public boolean checkName(String name){
        Pattern p = Pattern.compile(name);
        return(Pattern.matches("^[A-Z]{1}[a-z]{2,15}$",name));

    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        String firstName;
        boolean isValid = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstName");
        firstName = sc.nextLine();
        isValid = user.checkName(firstName);
        if(isValid){
            System.out.println("name updated");
        }else{
            System.out.println("Enter valid Input");
            firstName = sc.nextLine();
            isValid = user.checkName(firstName);

        }

    }
}
