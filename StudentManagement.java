public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2){
        return s1.getGroup().equals(s2.getGroup());
    }

    public Student[] students = new Student[100];
    int length_students = 0;

    public void addStudent(Student newStudent){
        students[length_students] = newStudent;
        length_students ++;
    }

    public String studentsByGroup() {
        String [] groups =  new String [100];
        int length_groups = 1;
        groups[0] = students[0].getGroup();
        String result = new String();
        int flat = 0;

        for(int i = 1; i<  length_students; i++)
        {
            flat = 0;
            for(int j=0; j< length_groups ;j++)
                if( students[i].getGroup().equals(groups[j])== false) flat++;

            if( flat == length_groups ){
                groups[length_groups]=students[i].getGroup();
                length_groups++;
            }
        }

        for(int i = 0; i< length_groups; i++)
        {
            result += groups[i]+"\n";
            for(int j=0 ; j< length_students ;j++ ){
                if(students[j].getGroup().equals(groups[i])==true)
                    result += students[j].getInfo()+'\n';
            }
        }
        return result;

    }

    public void removeStudent(String id) {
        for(int i = 0; i< length_students; i++)
            if(students[i].getId().equals(id))
            {
                for(int j = i; j< length_students;j++)
                    students[j]= students[j+1];
                length_students--;
                break;
            }

    }
}
 