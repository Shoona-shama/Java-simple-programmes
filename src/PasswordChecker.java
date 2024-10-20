import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args){

        // TODO make the code cleaner ?

        System.out.println("the password given, must meet these criteria : ");
        System.out.println("  1- it is exactly 3 charachters long ");
        System.out.println("  2- both inputs must be identical ");
        System.out.println("  3- at least one smallletter must be included ");
        System.out.println("  4- at least one capitalletter must be included");
        System.out.println("  5- at least one numbercharachter must be included");
        System.out.println();
        System.out.println("please give the Password :  ");
        Scanner input = new Scanner(System.in);
        String passwort1 = input.nextLine();

        System.out.println("please repeat the Password : ");
        String passwort2 = input.nextLine();
        input.close();

        if (passwort1.length() < 3 && passwort2.length() < 3) {
            System.out.println("The passwords must be at least 3 charachters long !");
        }
        if (!passwort1.equals(passwort2)){
            System.out.println("The passwords must be identical to one another !");
        }

        boolean hasUpperCase= false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        for (int i =0; i<passwort1.length(); i++) {
            char ch = passwort1.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

        }
            if (hasUpperCase && hasLowerCase && hasDigit) {
                System.out.println("Password does meet the criteria! ");
            }else{
                System.out.println("Password must meet the criteria ! ");
            } if (!hasUpperCase) {
                System.out.println("  - It's missing a Capitalletter ");
            }
            if (!hasLowerCase) {
                System.out.println("  - It's missing a Smallletter");
            }
            if (!hasDigit) {
                System.out.println("  - It's missing a Numbercharachter");
            }

    }
}
