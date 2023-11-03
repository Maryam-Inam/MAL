package mal;


import java.util.Stack;

public class Inbox {
    public Stack<Messages> inboxStack;

    Inbox(){
        inboxStack = new Stack<>();
    }
    
    public void send(String text, User receipient, User sender){
        receipient.inbox.inboxStack.push(new Messages(sender,text));
    }
}
