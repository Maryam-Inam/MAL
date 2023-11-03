package mal;


import java.util.HashMap;
import java.util.Map;

public class  Poke {
    public Map<String,User> pokeList;

    Poke(){
        pokeList = new HashMap<>();
    }

    public void pokeTo(User from, User man){
        man.poke.pokeList.putIfAbsent(from.username, from);
    }
}
