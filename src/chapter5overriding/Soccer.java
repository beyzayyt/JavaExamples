package chapter5overriding;

public class Soccer extends Sport {
    public String get_name() {
        return "Soccer Class";
    }

    void get_number_of_team_members() {
        super.get_number_of_team_members();
        System.out.println("Each team has 11 players in " + get_name());
    }
}
