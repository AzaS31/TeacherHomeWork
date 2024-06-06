import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<T extends User > implements Iterator<T> {
    private List<T> userList;
    private int counter = 0;

    public UserGroupIterator(List<T> userList) {
        this.userList = userList;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public T next() {
        if(hasNext()){
            return userList.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext())
            userList.remove(counter);
    }
}