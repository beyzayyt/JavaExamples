package chapter5overriding;

public class Sport {
    public String get_name() {
        return "Generic Sports";
    }

    void get_number_of_team_members() {
        System.out.println("Each team has n players in " + get_name());
    }
}