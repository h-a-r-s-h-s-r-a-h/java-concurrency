package program1;

public class ConcurreencyRunner{
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.incrementI();
        counter.incrementI();
        counter.incrementI();
        System.out.println(counter.getI());

        counter.incrementJ();
        counter.incrementJ();
        counter.incrementJ();
        counter.incrementJ();
        System.out.println(counter.getJ());
    }
}