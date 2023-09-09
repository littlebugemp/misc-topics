package callback.synchronous;

public class SynchronousEventConsumer {
    private final EventListener eventListener;

    public SynchronousEventConsumer(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public String doSynchronousOperation(){
        System.out.println("Performing callback before synchronous Task");
        return eventListener.onTrigger();
    }
}
