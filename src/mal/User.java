package mal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    public String name;
    long phone;
   public String city;
   public String institute;
    public final int ID;
    public final String username;
   public  String password;
    public Inbox inbox;
    public FriendList friendList;
    public FollowingList followingList;
   public Poke poke;
    static int count = 0;
    public String status;
    public Suggestions suggestions;
    
   public String maritalStatus;
   public String profession;
   public NewsFeed newsFeed;
    
    //public static User[] users= new User[3];
    public static Map<String,User> users =new HashMap<>();

    public User(String name, long phone, String city, String institute, String username, String password) {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.institute = institute;
        this.username = username;
        this.password = password;
        suggestions=new Suggestions();
        this.ID = generateID();
        inbox = new Inbox();
        friendList = new FriendList();
        followingList = new FollowingList();
        poke = new Poke();
        newsFeed = new NewsFeed();
        //users[count++] = this;
        users.putIfAbsent(this.username, this);
    }

    private int generateID(){
        return count;
    }

    public void addFriend(User friend){
        friendList.newFriend(this,friend);
    }

    public void follow(User man){
        followingList.newConnection(man);
        followingList.addFollower(this,man);
    }

    public void sendMessage(String msg, User recepient){
        inbox.send(msg, recepient, this);
    }

    public void poke(User to){
        poke.pokeTo(this,to);
    }
    
    public void setStatus(String status){
       this.status = status;
    }
    
    public void setMStatus(String status){
        maritalStatus = status;
    }
    
    public void setProfession(String profession){
        this.profession = profession;
    }
    
    public String toString()
    {
        return name + password;
    }
    
    public void post(String text){
        newsFeed.sendPost(text ,this);
    }

}
