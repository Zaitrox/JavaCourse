package javakurs;

import com.sun.javafx.font.directwrite.RECT;

public class Main {
    public static void main(String[] args) {
        /*
        BankAccount acc01 = new BankAccount(0, 2500.D);
        acc01.confInfo();

        CheckingAccount acc02 = new CheckingAccount(1, 1300.D, 3000.D);
        acc02.confInfo();

        System.out.println();

        Time z = new Days(3);
        System.out.println(z.getSeconds());

        z = new HoursMinutes(8, 30);
        System.out.println(z.getSeconds());

        Rectangle r = new Rectangle(10.5, 4.799);
        Circle c = new Circle(4.0049);
        System.out.println(r.getArea());
        System.out.println(c.getArea());
        System.out.println(GeoCompare.compare(r, c));

        Account account = new Account(4711);

        Account.Permissions perm = account.getPermissions();
        perm.canRead = true;

        System.out.println(perm.canRead);
        System.out.println(perm.canWrite);
        System.out.println(perm.canDelete);
        */

        // Recursion.feN(6);
        // Recursion.faculty(10);

        SubAccount k = new SubAccount(4277, 1E3D);

        k.deposit(5E2D);
        k.withdraw(7E2D);

        SubAccount.Transaction t = k.getLast();
        System.out.println(t.toString());
    }
}
