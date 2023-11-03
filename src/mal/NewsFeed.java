
package mal;

public class NewsFeed {
    
    public Posts post;
    String[] string;

    public NewsFeed() {
        post = new Posts();
        string = new String[post.posts.size()];
    }
    
    public void setStringbyPost(){
        for(int i = 0; i < post.posts.size(); i++){
            string[i] = post.posts.get(i).text;
        }
    }
    
    public String[] getFeed(){
        return string;
    }
    
    public void sendPost(String text, User user){
        post.sendPost(text, user);
    }
}
