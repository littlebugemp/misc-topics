package callback.consumer;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    public static void main(String[] args) {
        ConsumerCallback cc = new ConsumerCallback();
        int ageDiff = 10;
        AtomicInteger newAge = new AtomicInteger();
        int initialAge = 20;
        cc.getAge(20,(initialAge1)->{
            cc.increaseAge(initialAge,ageDiff,(newAge1)->{
                System.out.println("New Age -- "+newAge1);
                newAge.set(newAge1);
            });
        });
    }
}
