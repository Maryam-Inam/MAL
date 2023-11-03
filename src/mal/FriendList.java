package mal;


import java.util.HashMap;
import java.util.Map;

public class FriendList {
    public Map<String, User> friendList;

    FriendList(){
        friendList = new HashMap<>();
    }

    void newFriend(User from, User with){
        friendList.put(with.username, with);
        with.friendList.friendList.put(from.username, from);
    }
}
