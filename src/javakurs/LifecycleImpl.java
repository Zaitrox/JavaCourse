package javakurs;

public class LifecycleImpl implements Lifecycle {
    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }
}
