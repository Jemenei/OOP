public class Student extends Person implements CanHavePizza, CanHaveParty {
    public Student(String name) {
        super(name);
    }

    @Override
    public void eatPizza() {
        System.out.println("name" + " Пиццаны жеп жатыр");
    }


    @Override
    public void move() {
        System.out.println("name" + " КБТУ-дың ішінде жүр");
    }


    @Override
    public void dance() {
        System.out.println(name + " Вешірде билеп жүр");
    }
}
