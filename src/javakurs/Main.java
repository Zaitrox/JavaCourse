package javakurs;

public class Main {
    public static void main(String[] args) {
        BankAccount acc01 = new BankAccount(0, 2500.D);
        acc01.confInfo();

        CheckingAccount acc02 = new CheckingAccount(1, 1300.D, 3000.D);
        acc02.confInfo();

        System.out.println();

        Time z = new Days(3);
        System.out.println(z.getSeconds());

        z = new HoursMinutes(8, 30);
        System.out.println(z.getSeconds());
    }
}
