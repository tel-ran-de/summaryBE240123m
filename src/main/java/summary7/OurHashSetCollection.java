package summary7;

import java.util.HashMap;

public class OurHashSetCollection {
    HashMap <Integer, String> ourCollection = new HashMap<>();

    public void add(String data){
        Integer key = data.hashCode();
        ourCollection.put(key, data);
    }
}
