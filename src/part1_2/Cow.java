package part1_2;

public class Cow implements Voice, Wool, Wings {
    @Override
    public void voice() {
        System.out.println("Moo");
    }

    @Override
    public boolean hasWings() {
        return false;
    }

    @Override
    public boolean hasWool() {
        return false;
    }
}
