package mal;


import java.util.HashMap;
import java.util.Map;

public class FollowingList {
    public Map<String, User> following;
    public Map<String, User> follower;

    FollowingList(){
        following = new HashMap<>();
        follower = new HashMap<>();
    }

    public void newConnection(User man){
        following.putIfAbsent(man.username,man);

    }

    public void addFollower(User from,User to){
        to.followingList.follower.putIfAbsent(from.username,from);
    }
    
    public int followerCount(){
        return follower.keySet().size();
    }
    
    public int followingCount(){
        return following.keySet().size();
    }
}
