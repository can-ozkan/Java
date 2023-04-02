public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    // First constructor calls the second one and the second one calls the third one
    // Third constructor does all the work
    // No matter what constructor we call, the variables will always be initialized at third constructor
    // This is called constructor chaining
    // 1st constructor
    public Rectangle(){
        this(0, 0);
    }

    // 2nd constructor
    public Rectangle(int width, int height){
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
