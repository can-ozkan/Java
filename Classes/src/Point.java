public class Point {

    // How to find the distance between two points?
    // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        // it needs to return the distance between this Point and Point 0,0 as double.
        // P(4.5) and P(0.0)
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

        double sqrt = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
        return sqrt;

    }

    public double distance(int x, int y){
        double sqrt = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        return sqrt;
    }

    public double distance(Point point){
        double sqrt = Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
        return sqrt;
    }
}
