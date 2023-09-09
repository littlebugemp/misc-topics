package callback.consumer;

import java.util.function.Consumer;

public class ConsumerCallback {
    public void getAge(int initialAge, Consumer<Integer> callback){
        callback.accept(initialAge);
    }

    public void increaseAge(int initialAge, int ageDiff, Consumer<Integer> callback){
        System.out.println("--Increase Age--");
        int newAge = initialAge+ageDiff;
        callback.accept(newAge);
    }
}
