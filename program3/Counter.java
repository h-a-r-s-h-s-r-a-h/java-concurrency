package program3;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger i = new AtomicInteger(3);
    private AtomicInteger j = new AtomicInteger(4);
    
    public void incrementI(){
        i.incrementAndGet();
    }
    public int getI(){
        return i.get();
    }

    
    public void incrementJ(){
        j.incrementAndGet();
    }
    public int getJ(){
        return j.get();
    }
}
