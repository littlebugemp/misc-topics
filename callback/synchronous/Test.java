package callback.synchronous;

public class Test {
    public static void main(String[] args) {
        EventListener eventListener = new SynchronousEventListenerImpl();
        SynchronousEventConsumer consumer = new SynchronousEventConsumer(eventListener);
        String result = consumer.doSynchronousOperation();
        System.out.println(result);
    }
}
