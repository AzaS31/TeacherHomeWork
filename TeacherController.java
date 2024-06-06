import java.util.ArrayList;
import java.util.List;

public class TeacherController implements UserController<Teacher> {
    TeacherGroup teachers = new TeacherGroup(new ArrayList<>());
    TeacherView teacherView = new TeacherView();
    TeacherService service = new TeacherService(teachers);

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        if(!teachers.getTeacherList().isEmpty()) {
            maxId = teachers.getTeacherList().get(teachers.getTeacherList().size() - 1).getTeacherId() + 1;
        }
        Teacher teacher = new Teacher(maxId, firstName, secondName, lastName);
        teachers.addTeacher(teacher);
    }

    void printTeacherList() {
        teacherView.sendOnConsole(teachers.getTeacherList());
    }

    void changeName(int teacherId, String newName) {
        for(Teacher teacher : teachers.getTeacherList()) {
            if(teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(newName);
            }
        }
    }

  void printSortedTeachersByFIO () {
        List<Teacher> sortedTeachers = service.getSortedTeacherGroupByFIO();
        teacherView.sendOnConsole(sortedTeachers);
    }
}
