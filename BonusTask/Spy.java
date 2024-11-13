package BonusTask;

public class Spy extends Person {
    public Spy(String name, int key) {
        super(name);
        setGeneratedKey(key);
    }


    @Override
    public String toString() {
        return "Spy name: " + getName() + ", key is " + getGeneratedKey();
    }
}
