public class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }


    public boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if(eater instanceof Person) {
            System.out.println(((Person)eater).name + "үшін төлем процесі");
            return true;
        }
        System.out.println("Қонақымызға арналған пицца");
        return false;
    }
}
