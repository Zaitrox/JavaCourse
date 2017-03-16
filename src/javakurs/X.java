package javakurs;

public interface X {
    void m1();

    default void m2() {
        System.out.println("Methode m2()");
    }

    default void m3() {
        System.out.println("Methode m3()");
    }
}
