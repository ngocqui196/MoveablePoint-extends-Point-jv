public class Main {
    public static void main(String[] args) {
        Point2D p2D = new Point2D(3.0f,4.0f);
        System.out.println(p2D.getXY()[0]+","+p2D.getXY()[1]);

        MovablePoint movablePoint = new MovablePoint(3.0f,4.0f,8.0f,7.0f);
        System.out.println(movablePoint.toString());

        movablePoint.move();
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
