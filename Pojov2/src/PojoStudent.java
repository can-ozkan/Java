import java.util.ArrayList;

public class PojoStudent {

    private int id;
    private String name;
    private String dateOfBirth;
    private ArrayList<String> courses;

    public PojoStudent(int id, String name, String dateOfBirth, ArrayList<String> courses) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.courses = new ArrayList<>(courses);
    }

    @Override
    public String toString() {
        return "PojoStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", courses=" + courses +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
}
