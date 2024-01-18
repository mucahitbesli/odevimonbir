public class Female extends Person {
    public Female(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public int calculateRetirementAge() {
        return 60;
    }
}
