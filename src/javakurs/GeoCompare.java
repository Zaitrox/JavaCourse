package javakurs;

public class GeoCompare {
    public static int compare(Geo a, Geo b) {
        final double EPSILON = 1E-3D;
        double x = a.getArea();
        double y = b.getArea();

        if(x <= y - EPSILON)
            return -1;
        else if(x >= y + EPSILON)
            return 1;
        else
            return 0;
    }
}
