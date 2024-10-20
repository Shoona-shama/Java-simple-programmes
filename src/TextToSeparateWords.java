import java.util.Scanner;

public class TextToSeparateWords {

    public static void main(String[] args) {

        System.out.println("Please give a clear text : ");
        Scanner sc = new Scanner(System.in);
        String theGivenText = sc.nextLine();

       if (isTextClear(theGivenText)){
           System.out.println(" ");
           textSeparationToWords(theGivenText);
       }else {
           System.out.println("the text is unclear, please write again ");
       }
    }
        public static boolean isTextClear(String theGivenText) {
            String[] words = theGivenText.split(" ");
            return words.length > 1;
        }
        public static void textSeparationToWords(String theGivenText){
            System.out.println("The separate text is : ");
            String[] wordsSep = theGivenText.split(" ");
            for (String word : wordsSep) {
                System.out.println(word);
            }

         }

}
