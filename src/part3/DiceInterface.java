package part3;

import java.util.Random;

public interface DiceInterface {

    Dice dice = new Dice();

    static void startGame(final int playersCount, final int dicesCount) {
        dice.setDicesCount(dicesCount);
        dice.setDice(new Random());
        Player[] players = new Player[playersCount];

        for (int i = 0; i < playersCount; i++) {
            players[i] = new Player();
            players[i].setIndex(i);
        }

        int maxWinsCount = 0;
        int winner = 0;
        int round = 1;

        while (maxWinsCount < 7) {
            System.out.println("*** Round " + round + " ***");
            int maxRoll = 0;

            for (int i = 0; i < players.length; i++) {
                System.out.print("Player " + "(" + players[i].getWins() + "w) " + players[i].getIndex() + " rolled ");
                //ход
                roll(players[i]);
                System.out.println(" (total: " + players[i].getCurrentRollSum() + ")");
                //поиск победителя
                if (maxRoll < players[i].getCurrentRollSum()) {
                    maxRoll = players[i].getCurrentRollSum();
                    winner = i;
                }
            }

            players[winner].setWins(players[winner].getWins() +1);
            //ставим победителя раунда на первое место
            for (int i = winner; i > 0; i--) {
                Player buffer = players[i];
                players[i] = players[i - 1];
                players[i - 1] = buffer;
            }

            for (Player p : players) {
                if (p.getWins() > maxWinsCount) {
                    maxWinsCount = p.getWins();
                }
            }
            //всегда выводится 0-й игрок, так как перед этим победитель ставится на 0 индекс в массиве
            System.out.println("*** Player " + players[0].getIndex() + " won round " + round + " ***");
            round++;
        }
        System.out.println("*** Player " + players[0].getIndex() + " won the game! ***");
    }

    static void roll(Player player) {
        player.setCurrentRollSum(0);
        int croll = 0;
        //кидаем все кости
        for (int i = 0; i < Dice.getDicesCount(); i++) {
            croll = Dice.getDice().nextInt(12);
            player.setCurrentRollSum(player.getCurrentRollSum() + croll);
            System.out.print(croll + " ");
        }
    }

}


