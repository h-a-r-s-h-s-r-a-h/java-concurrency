package program4;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        Map<Character, LongAdder> occurance = new Hashtable<>();
        String str ="ABCD ABCD ABCD";
        for(char character:str.toCharArray()){
            LongAdder longAdder = occurance.get(character);
            if(longAdder == null){
                longAdder = new LongAdder();
            }
            longAdder.increment();
            occurance.put(character,longAdder);
        }
        System.out.println(occurance);

    }
}
