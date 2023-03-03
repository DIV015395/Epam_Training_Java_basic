package com.epam.rd.autotasks.segments;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

class Segment {
    Point start;
    Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null) {
            throw new IllegalArgumentException("Arguments can't be null");
        }
        if (start.getX()==end.getX()&&start.getY()==end.getY()) {
            throw new IllegalArgumentException();
        }
        this.start = start;
        this.end = end;


    }


    double length() {
        return sqrt(pow(end.getX() - start.getX(), 2) + pow(end.getY() - start.getY(), 2));
    }

    Point middle() {
        return new Point((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);
    }

    Point intersection(Segment another) {

        double k1 = (end.getY() - start.getY()) / (end.getX() - start.getX());
        double k2 = (another.end.getY() - another.start.getY()) / (another.end.getX() - another.start.getX());
        if (k1 == k2) return null;

        double b1 = (start.getY() * end.getX() - end.getY() * start.getX()) / (end.getX() - start.getX());
        double b2 = (another.start.getY() * another.end.getX() - another.end.getY() * another.start.getX()) /
                (another.end.getX() - another.start.getX());

        double x = (b2 - b1) / (k1 - k2);
        double y = (k1 * b2 - k2 * b1) / (k1 - k2);

        if ((x > start.getX() && x > end.getX()) || (x > another.start.getX() && x > another.end.getX()) ||
                (x < start.getX() && x < end.getX()) || (x < another.start.getX() && x < another.end.getX()) ||
                (y > start.getY() && y > end.getY()) || (y > another.start.getY() && y > another.end.getY()) ||
                (y < start.getY() && y < end.getY()) || (y < another.start.getY() && y < another.end.getY()))
            return null;

        return new Point(x, y);
    }

}
