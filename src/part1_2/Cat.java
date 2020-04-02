package part1_2;

public class Cat implements Voice, Wool, Wings {
    @Override
    public void voice() {
        System.out.println("Meow");
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
