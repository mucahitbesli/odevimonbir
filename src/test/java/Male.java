public class Male extends Person {
    public Male(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public int calculateRetirementAge() {
        return 65;
    }
}

