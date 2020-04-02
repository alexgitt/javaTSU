package part1_2;

public class Dog implements Voice, Wool, Wings {
    @Override
    public void voice() {
        System.out.println("Gaw");
    }

    @Override
    public boolean hasWings() {
        return false;
    }

    @Override
    public boolean hasWool() {
        return true;
    }
}
