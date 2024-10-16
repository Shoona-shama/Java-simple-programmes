
import java.util.Scanner;

public class MobilePleaseDontDisturbModus {

    public static void main(String[] args){
        System.out.println("The Mobile phone is set on please-don't-disturb modus ! " +
                "you shall not be bothered !" );
        final String num1 = "SCHATZI";
        final String num2 = "MUTTI";

        Scanner in = new Scanner(System.in);
        System.out.println("who is calling ? please give in capital letters :");
        String telephone = in.nextLine();


        Scanner uhrEingabe = new Scanner(System.in);
        System.out.println("what is the time now ? please give only the hours :");
        int uhr = uhrEingabe.nextInt();

            if (telephone.equals(num1) && (uhr >= 22 || uhr <= 10)) {
                System.out.println(" Kling-Kling " + num1 + " " + "is calling ! ");

            } else if (telephone.equals(num2) && uhr >= 8 && uhr <= 10) {
                System.out.println(" Kling-Kling " + num2 + " " + "is calling ! ");

            } else if (!telephone.equals(num1) && !telephone.equals(num2) && uhr >= 22 || uhr <= 10){
                System.out.println("...");
            }



    }


}
