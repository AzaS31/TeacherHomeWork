public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.create("Ivan", "Ivanovich", "Ivanov");
        teacherController.create("Azamat", "Azamatovich", "Azamatov");
        teacherController.create("Marat", "Maratovich", "Maratov");
        System.out.println("Teacher list:");
        teacherController.printTeacherList();
        System.out.println();
        System.out.println("Sorted By FIO List:");
        teacherController.printSortedTeachersByFIO();
        teacherController.changeName(0, "NEWNAME");
        System.out.println();
        System.out.println("Renamed:");
        teacherController.printTeacherList();
    }       
}