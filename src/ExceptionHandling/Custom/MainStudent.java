package ExceptionHandling.Custom;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Omraj",26));
        studentList.add(new Student(2,"Niraj",23));
        studentList.add(new Student(3,"Suraj",26));
        studentList.add(new Student(4,"Suju",22));
        try{
            System.out.println(findStudentById(studentList,5));
        } catch (StudentByIdNotFound e) {
            System.out.println("Exception :"+ e.getMessage());
        }
        System.out.println("Normal Execution");
    }
    private static Student findStudentById(List<Student> studentList, int id) throws StudentByIdNotFound {
        return studentList.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElseThrow(() -> new StudentByIdNotFound("Student with id " + id + " not found!"));
    }
}
