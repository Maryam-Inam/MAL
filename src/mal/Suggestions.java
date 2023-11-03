/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Suggestions {
    public List<User> friendsToBe;

    public Suggestions() {
        friendsToBe = new ArrayList<>();
    }
    
    public List<User> suggestFriends(User user){
        List<User> list = new ArrayList<>();
        for (User friend : user.friendList.friendList.values()) {
            for(User sugg : friend.friendList.friendList.values()){
                if(!user.friendList.friendList.containsKey(sugg.username))
                    list.add(sugg);
            }
        }
        return list;
    }
    
}
