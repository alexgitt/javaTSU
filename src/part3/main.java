package part3;

import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] argc) {

        final Scanner scanner = new Scanner(System.in);

        System.out.println("Enter players count");

        int playersCount = scanner.nextInt();

        System.out.println("Enter dices count");

        int dicesCount = scanner.nextInt();

        DiceInterface.startGame(playersCount, dicesCount);

    }

}
