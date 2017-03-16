package javakurs;

public class XImpl2 implements X {
    public void m1() {
        System.out.println("Methode m1()");
    }

    public void m2() {
        System.out.println("Methode m2() neu implementiert");
    }

    public static void main(String[] args) {
        X x = new XImpl2();
        x.m2();
        x.m3();
    }
}
