package package1;

public class Picture {
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    //private Circle sun2;    //1-14

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        //sun.slowMoveVertical(300);    //1-15

        //sun2 = new Circle();
        //sun2.changeColor("yellow");
        //sun2.moveHorizontal(-30);
        //sun2.moveVertical(-10);
        //sun2.changeSize(60);
        //sun2.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            //sun2.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            //sun.changeColor("yellow");
            sun.changeColor("blue");
            //sun2.changeColor("red");
        }
    }

    public void sunSet()
    {
        sun.slowMoveVertical(300);
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        //picture.setBlackAndWhite();
        picture.draw();
        //picture.setColor();   //1-13
        //picture.sunSet(); //1-16
    }
}
