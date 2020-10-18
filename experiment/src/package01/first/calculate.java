package package01.first;

class Trapezium {
    private int length1;
    private int length2;
    private int height;

    public Trapezium(int length1, int length2, int height) {
        this.length1 = length1;
        this.length2 = length2;
        this.height = height;
    }

    public Trapezium() {
    }

    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return (length1 + length2) * height / 2;
    }
}

class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int area() {
        return radius * radius * 3;
    }


}
public class calculate {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("圆形的半径是：" + circle.getRadius());
        System.out.println("圆形的面积是：" + circle.area());

        System.out.println("===============");

        Trapezium tra = new Trapezium();
        tra.setHeight(2);
        tra.setLength1(1);
        tra.setLength2(3);
        System.out.println("梯形的高度是：" + tra.getHeight());
        System.out.println("梯形的上底是：" + tra.getLength1());
        System.out.println("梯形的下底是：" + tra.getLength2());
        System.out.println("梯形的面积是：" + tra.area());

    }
}
