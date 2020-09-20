package package1;

public class NewSquare {
    private Square s1;

    public void draw()
    {
        s1 = new Square();
        s1.moveVertical(100);
        s1.changeSize(100);
        s1.makeVisible();
        //s1.moveDown();    //move down
        //s1.moveDown();    //move domn
        //s1.makeInvisible();   //disappear
        //s1.makeInvisible();   //disappear
    }

    public static void main(String[] args) {
        NewSquare newSquare = new NewSquare();
        newSquare.draw();
    }
}
