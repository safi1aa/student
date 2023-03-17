public class Student {
   String StudentName;
    int age;
    String surname;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void method(){
        if (this.StudentName.equals("Azamat")){
            System.out.println("Teacher name: "+StudentName);
        }else
            System.out.println("studentName: "+StudentName);
    }
}
