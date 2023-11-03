/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mal;

/**
 *
 * @author HP
 */
public class MAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User maryam = new User("name", 123, "Lahore", "abc", "maryam", "aa");
        User  ammar= new User("ammar", 123, "Lahore", "aa", "ammar", "aa");
        User  ammar2= new User("ammar2", 123, "Lahore", "aa", "aaa", "aa");
        User user = new User("user", 123, "Lahore", "aa", "ggg", "aa");
        
        maryam.addFriend(user);
        maryam.addFriend(ammar);
        maryam.addFriend(ammar2);

    }
    
}
