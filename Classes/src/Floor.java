public class Floor {

    private double width;
    private double height;

    public Floor(double width, double height) {
        this.width = width;
        this.height = height;

        if (width < 0) this.width =0;
        if (height < 0) this.height =0;

    }

    public double getArea(){
        return width * height;
    }
}
