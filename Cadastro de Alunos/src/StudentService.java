import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();
    private int counterId = 1;

    // CREATE
    public void createStudent(Student student){
        student.setId(counterId++);
        students.add(student);
    }

    // READ
    public  List<Student> readStudent(){
        return students;
    }

    // UPDATE
    public void updateStudent(int id, String newName) {
        for (Student a : students) {
            if (a.getId() == id) {
                a.setName(newName);
            }
        }
    }

    // DELETE
    public void deleteStudent(int id) {
        students.removeIf(a -> a.getId() == id);
    }

}
