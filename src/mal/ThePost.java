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
public class ThePost {
   public String text;
    public String sentBy;

    public ThePost(String text, String sentBy) {
        this.text = text;
        this.sentBy = sentBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSentBy() {
        return sentBy;
    }

    public void setSentBy(String sentBy) {
        this.sentBy = sentBy;
    }
    
    
    
}
