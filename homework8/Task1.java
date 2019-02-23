package homework8;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        String text = "London is the capital of the UK, NOT Great Britain. Also, London is the capital of England";
        Map<String, Integer> map = new HashMap<>( );
        String words[] = text.split(" ");
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
                continue;
            }
            map.put(word, 1);
        }
        for (Map.Entry entry : map.entrySet( )) {
            System.out.println(entry.getKey( ) + " - " + entry.getValue( ));
        }
    }
}