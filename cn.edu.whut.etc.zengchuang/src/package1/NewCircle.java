package package1;

public class NewCircle {
    private Circle c1;

    public void draw()
    {
        c1 = new Circle();
        c1.changeColor("blue");
        c1.moveHorizontal(30);
        c1.moveVertical(-30);
        c1.changeSize(100);
        c1.makeVisible();
        //c1.moveDown();    //move down 20
        //c1.moveDown();    //move down 20
        //c1.makeInvisible();   //disappear
        //c1.makeInvisible();   //disappear
        c1.moveVertical(30);    //move down 30
        c1.slowMoveVertical(-30);   //slow move up 30
        c1.changeSize(50);  //diameter change to 50
        c1.moveHorizontal(-70); //move left 70
        c1.changeColor("red");  //color turn to red
        c1.changeColor("orange");   //color turn to black
        //c1.changeColor(green);  //error

    }

    public static void main(String[] args) {
        NewCircle newcircle = new NewCircle();
        newcircle.draw();;
    }
}
