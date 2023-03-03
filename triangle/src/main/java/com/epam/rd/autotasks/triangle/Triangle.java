package com.epam.rd.autotasks.triangle;

class Triangle {
    Point a ;
    Point b ;
    Point c;


    public Triangle(Point a, Point b, Point c) {
        //TODO
        this.a=a;
        this.b=b;
        this.c=c;
        if(a.getX()*(b.getY()-c.getY())+b.getX()*(c.getY()-a.getY())+c.getX()*(a.getY()- b.getY())==0) {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double ans =0.5* Math.abs((a.getX()*(b.getY()-c.getY())+b.getX()*(c.getY()-a.getY())+c.getX()*(a.getY()-b.getY())));
        return ans;
        //TODO
    }

    public Point centroid(){
        //TODO
        double x= (a.getX()+b.getX()+c.getX())/3;
        double y = (a.getY()+b.getY()+c.getY())/3;
        return  new Point(x,y);
    }
}
