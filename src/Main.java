import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("hull.in")); 	// "hull.in"  Input Sample => size x y x y x y x y
        StringTokenizer st = new StringTokenizer(f.readLine());
        Point[] p = new Point[Integer.parseInt(st.nextToken())];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Point();
            p[i].x = Integer.parseInt(st.nextToken()); // Read X coordinate
            p[i].y = Integer.parseInt(st.nextToken()); // Read y coordinate
        }

        Point[] hull = convex_hull(p).clone();

        for (int i = 0; i < hull.length; i++) {
            if (hull[i] != null)
                System.out.print(hull[i]);
        }
    }

}