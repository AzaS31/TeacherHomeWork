import java.util.List;

public class UserView<T extends User> {
    void sendOnConsole(List<T> users) {
        for (T user : users) {
            System.out.println(user);
        }
    }
}
