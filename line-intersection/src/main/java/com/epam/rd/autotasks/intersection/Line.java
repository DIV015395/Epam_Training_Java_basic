package com.epam.rd.autotasks.intersection;

public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other)
    {
        if (this.k == other.k && this.b == other.b) {
            // The lines coincide
            return null;
        } else if (this.k == other.k) {
            // The lines are parallel
            return null;
        } else {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = this.k * x + this.b;
            return new Point(x, y);
        }
    }

}
