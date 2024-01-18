import java.util.ArrayList;
import java.util.List;

public class Department {
    private TeamLead teamLead;
    private List<Person> personnelList;
    private List<String> assignmentList;

    public Department(TeamLead teamLead) {
        if (teamLead == null) {
            throw new IllegalArgumentException("A department must have a team lead.");
        }
        this.teamLead = teamLead;
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    // Getter ve Setter metotları

    public List<Person> getPersonnelList() {
        return personnelList;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }

    public void changeTeamLead(TeamLead newTeamLead) {
        if (newTeamLead == null) {
            throw new IllegalArgumentException("Team lead cannot be null.");
        }
        this.teamLead = newTeamLead;
    }

    public void addPerson(Person person) {
        personnelList.add(person);
    }

    public void removePerson(Person person) {
        personnelList.remove(person);
    }

    public void changePerson(Person oldPerson, Person newPerson) {
        int index = personnelList.indexOf(oldPerson);
        if (index != -1) {
            personnelList.set(index, newPerson);
        }
    }

    public void addAssignment(String assignment) {
        assignmentList.add(assignment);
    }

    public void markAssignmentCompleted(String assignment) {
        assignmentList.remove(assignment);
    }
}
