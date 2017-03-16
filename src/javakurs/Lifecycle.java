package javakurs;

public interface Lifecycle {
    void start();
    void stop();

    default void init() {}
    default void destroy() {}
}
