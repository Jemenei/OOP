package BonusTask;

import java.util.Random;


class Person {
    private String name;
    private int generatedKey;

    public Person(String name) {
        this.name = name;
        this.generatedKey = generatedRandomKey();
    }

    public String getName() {
        return name;
    }

    public int getGeneratedKey() {
        return generatedKey;
    }

    protected void setGeneratedKey(int key) {
        this.generatedKey = key;
    }

    private int generatedRandomKey() {
        Random random = new Random();
        return random.nextInt(100);
    }
}