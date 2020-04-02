package part3;

public class Player {
    private int wins; //количество побед в прошедших раундах
    private int currentRollSum; //сумма бросков в раунде
    private int index; //номер игрока (ник)



    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getCurrentRollSum() {
        return currentRollSum;
    }

    public void setCurrentRollSum(int currentRollSum) {
        this.currentRollSum = currentRollSum;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}