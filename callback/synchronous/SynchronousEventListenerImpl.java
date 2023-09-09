package callback.synchronous;

public class SynchronousEventListenerImpl implements EventListener{
    @Override
    public String onTrigger() {
        return "Synchronously running callback function";
    }
}
