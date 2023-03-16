public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("java");
        person.setNumber(14);
        person.setTachersName("azamat");
        person.setStartingDay(6);

        System.out.println(person.getName()+"\n"+person.getNumber()+"\n"+person.getTachersName()+
                "\n"+person.getStartingDay());

        Student student = new Student();
        student.setStudentName("safia");
        student.setAge(14);
        student.setFaculty("java");

        System.out.println(student.getStudentName()+"\n"+student.getAge());
    }

}
