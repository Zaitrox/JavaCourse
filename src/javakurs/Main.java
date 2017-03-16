package javakurs;

public class Main {
    public static void main(String[] args) {
        /* BankAccount acc01 = new BankAccount(0, 2500.D);
        acc01.confInfo();

        CheckingAccount acc02 = new CheckingAccount(1, 1300.D, 3000.D);
        acc02.confInfo();

        System.out.println();

        Time z = new Days(3);
        System.out.println(z.getSeconds());

        z = new HoursMinutes(8, 30);
        System.out.println(z.getSeconds()); */

        Rectangle r = new Rectangle(10.5, 4.799);
        Circle c = new Circle(4.0049);
        System.out.println(r.getArea());
        System.out.println(c.getArea());
        System.out.println(GeoCompare.compare(r, c));
    }
}
