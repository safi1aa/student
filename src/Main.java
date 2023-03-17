import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.setStudentName(scanner.nextLine());
        student.setSurname(scanner.nextLine());
        student.setAge(scanner.nextInt());
        student.method();
        System.out.println("Surname: "+student.getSurname()+ "\n" + "Age: " + student.getAge()+"\n");
    }
}