public class Student {
   private String StudentName;
   private int age;
   private String faculty;

    public String getStudentName() {
        return StudentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;


    }
}
