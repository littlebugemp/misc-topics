package callback.asynchronous;

public class AsynchronousEventListenerImpl implements EventListener{
    @Override
    public String onTrigger() {
        respondTrigger();
        return "Asynchronously running callback function";
    }

    @Override
    public void respondTrigger() {
        System.out.println("This is a side effect of the asynchronous trigger.");
    }
}
