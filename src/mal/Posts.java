
package mal;

import java.util.ArrayList;
import java.util.List;

public class Posts {
    public List<ThePost> posts;

    public Posts() {
        posts = new ArrayList<>();
    }
    
    public void sendPost(String text ,User user){
       
        
        user.newsFeed.post.posts.add(new ThePost(text, user.username));
        
        for (User u : user.friendList.friendList.values()) {
            System.out.println(u.name);
            u.newsFeed.post.posts.add(new ThePost(text, user.username));
        }
    }
}
