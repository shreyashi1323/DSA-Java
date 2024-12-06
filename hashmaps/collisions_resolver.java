package hashmaps;
import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.LinkedList;
class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode()% entities.length);
        entities[hash]  = new Entity(key,value); //overriding
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!= null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!= null && entities[hash].key.equals(key)){
            entities[hash]= null;
        }}
    private class Entity{
        String key;
        String value;

        public Entity(String Key , String value){
            this.key = key;
            this.value= value;

        }
    }
}
public class collisions_resolver {
    public static void main(String[] args) {
       MapUsingHash map = new MapUsingHash();
       map.put("mango","king of fruits");
       map.put("apple", "red fruit");
       map.put("shreyy", "sweet lil gurl");
        System.out.println(map.get("apple"));
    }
}
