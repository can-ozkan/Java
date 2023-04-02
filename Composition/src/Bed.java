public class Bed {

    private String style;
    private int pillows;
    private double height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, double height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public double getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }
}
