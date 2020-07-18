/**
 * Created by CCNE on 18/07/2020.
 */
public class Student {
    public Student() {
        setEmail("uet@vnu.edu.vn");
        setGroup("K62CB");
        setId("000");
        setName("Student");
    }

    public Student(String name, String id, String email) {
        setGroup("K62CB");
    }

    Student(Student s) {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public String getId() {
        return id;
    }

    public  void setName(String inputName) {
        name = inputName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        String tmp = getName() + " - " + getId() + " - " + getGroup() + " - " + getEmail();
        return tmp;

    }
    private String name;
    private String id;
    private String group;
    private String email;

}

