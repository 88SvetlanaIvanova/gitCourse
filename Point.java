public class Point {
    private  int x;
    private int y;

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


}
 class Line {
    private Point start;
    private Point end;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString(){
        return "[(" + start.getX()+"," + start.getY() + "),(" + end.getX()+"," + end.getY() + ")]";
    }
}
class Test2{
   // Line line = new Line(1,2,3,4);
}

