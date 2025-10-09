public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println("Point test:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        p1.move(2, 2);
        p2.move(-1, 1);

        System.out.println("After moving:");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        double distance = Math.sqrt(
            Math.pow(p2.getX() - p1.getX(), 2) +
            Math.pow(p2.getY() - p1.getY(), 2)
        );
        System.out.println("Distance = " + distance);
    }
}
