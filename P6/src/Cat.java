import java.sql.SQLOutput;

public class Cat extends Animal implements CanHavePizza {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void breath() {
        System.out.println(name + "ауа жұтып тұр");
    }


    @Override
    public void eatPizza() {
        System.out.println(name + "Пиццаға қарап тұр, бірақ жеп тұрған жоқ");
    }
}
