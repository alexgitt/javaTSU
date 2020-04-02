package part3;

import java.util.Random;

public class Dice implements DiceInterface {

    private static int dicesCount;
    private static Random dice;

    public static Random getDice() {
        return dice;
    }

    public void setDice(Random dice) {
        this.dice = dice;
    }

    public static int getDicesCount() {
        return dicesCount;
    }

    public void setDicesCount(int dicesCount) {
        this.dicesCount = dicesCount;
    }
}
