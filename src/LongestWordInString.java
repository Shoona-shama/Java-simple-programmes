import java.util.Arrays;
import java.util.Scanner;


public class LongestWordInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String strVomNutzer = sc.nextLine();
        String regex = " ";
        String[] arrVomStr = strVomNutzer.split(regex);
        System.out.println(Arrays.toString(arrVomStr));

        String laengstesWort = "";
        for (String wort : arrVomStr) {
            if (wort.length() > laengstesWort.length()) {
                laengstesWort = wort;
            }
        }
        System.out.println("Das längste Wort ist: " + laengstesWort);
    }
}