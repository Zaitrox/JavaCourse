package javakurs;

public class Recursion {
    private static int level = 0;
    private static int res = 0;

    public static boolean feN(int n) {
        System.out.println("Level: " + level);
        level++;
        if(n == 0) {
            System.out.println("true");
            return true;
        }
        else if(n < 0) {
            System.out.println("false");
            return false;
        }
        else {
            System.out.println("n: " + n);
            System.out.println();
            feN(n - 1);
        }

        return false;
    }

    public static int faculty(int n) throws Exception {
        if(n < 0) throw new Exception("No negative numbers please!");
        if(n == 0) return 1;
        return n * faculty(n - 1);
    }

    public static void main(String[] args) {
        try {
            System.out.println(faculty(5));
        } catch(Exception wrongNumber) {
            System.out.println(wrongNumber);
        }
    }
}
