package Problem5;

public class PhDStudent extends Person {
    private String researchTopic;

    public PhDStudent(String name, int age, String researchTopic) {
        super(name, age);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student";
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD students cannot own high-maintenance pets like dogs.");
        } else {
            super.assignPet(pet);
        }
    }
}
