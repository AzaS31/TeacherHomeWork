import java.util.List;

public class UserGroup<T extends User>{
    private List<T> userList;

    public UserGroup(List<T> userList) {
        this.userList = userList;
    }

    public List<T> getUserList() {
        return userList;
    }
    
    public void addUser(T user){
        userList.add(user);
    }
}