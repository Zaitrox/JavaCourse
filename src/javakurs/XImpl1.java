package javakurs;

public class XImpl1 implements X {
    public void m1() {
        System.out.println("Methode m1()");
    }

    public static void main(String[] args) {
        X x = new XImpl1();
        x.m2();
        x.m3();
    }
}
