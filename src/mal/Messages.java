

package mal;
public class Messages {
    public String text;
    public User sender;

    Messages(User sender, String text){
        this.sender = sender;
        this.text = text;
    }
}
