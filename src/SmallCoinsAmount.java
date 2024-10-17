import java.util.Scanner;

public class SmallCoinsAmount {

    public static void amount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("please give an amount in Euro :  ");
        double giveAmount = sc.nextDouble();

        //TODO you can throw an exception here ...

        int amountInCent = (int) Math.round(giveAmount * 100);
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
        int[] numberCoins = new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            numberCoins[i] = amountInCent / coins[i];
            amountInCent %= coins[i];
        }
        sc.close();
        System.out.println("the given Amount is seen here as small coins : ");
        System.out.println(numberCoins[0] + " ×2Euro   " + numberCoins[1] + " ×1Euro   " + numberCoins[2] + " ×50Cent   " + numberCoins[3] +
                " ×20Cent   " + numberCoins[4] + " ×10Cent   " + numberCoins[5]  + " ×5Cent   " + numberCoins[6] + " ×2Cent   " + numberCoins[7] +
                " ×1Cent");

    }
    
    public static void main(String[] args){
         amount();
    }
}
