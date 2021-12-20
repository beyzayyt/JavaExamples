package chapter5Inheritance;

public class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(){
        this.designation = designation;
    }
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    void does(){
        System.out.println("Teaching");
    }
}
