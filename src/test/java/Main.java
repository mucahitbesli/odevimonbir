public class Main {
    public static void main(String[] args) {
        TeamLead teamLead = new TeamLead("Serkan", "Cura", "01/01/1980");
        Department department = new Department(teamLead);

        Male maleEmployee = new Male("Mücahit", "Besli", "05/15/1990");
        Female femaleEmployee = new Female("Bahar", "Besli", "03/20/1990");

        department.addPerson(maleEmployee);
        department.addPerson(femaleEmployee);

        department.addAssignment("Project A");
        department.addAssignment("Project B");

        System.out.println("Personnel List: " + department.getPersonnelList());
        System.out.println("Assignments: " + department.getAssignmentList());

        department.markAssignmentCompleted("Project A");
        department.removePerson(maleEmployee);

        System.out.println("Updated Personnel List: " + department.getPersonnelList());
        System.out.println("Updated Assignments: " + department.getAssignmentList());
    }
}

