package mal;


import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        User maryam = new User("Ammar", 123, "Lahore", "CUI", "ammar", "aaaa");
        User maryam2 = new User("Ammar Uppal", 456, "Kot Lakhpat", "CUI", "ammar2", "123");
        User olaf = new User("Olaf", 999, "Isb", "CUI", "ammar3", "olaf");
        
        maryam.addFriend(olaf);
        maryam.addFriend(maryam2);
        
        olaf.follow(maryam);
        maryam2.addFriend(olaf);
        olaf.sendMessage("a", maryam);
        maryam2.sendMessage("b", maryam);
        olaf.sendMessage("yayyy", maryam);
        olaf.sendMessage("naaayyyy", maryam);
        maryam2.sendMessage("woww", maryam);
        maryam2.sendMessage("new message", maryam);
        olaf.sendMessage("new enw", maryam);
        
        maryam.follow(olaf);
        maryam2.follow(maryam);
        maryam.follow(maryam2);
        
        olaf.post("hello");
        
        maryam.sendMessage("hello", olaf);
        maryam.poke(olaf);

//        ammar.sendMessage("hello", ali);
//        ammar.sendMessage("whats popping", ali);

    }
}
