
package model;


public class Model {
    private double a;
    private double b;       
    private double c;
    private double x;
    private double x1;
    private double x2;
    private double delta;
    
    public       Model (){
    }
    
    public Model(double a, double b, double c, double x, double x1, double x2, double delta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.x1 = x1;
        this.x2 = x2;
        this.delta = delta;
    }
     public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX() {
        return x;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getDelta() {
        return delta;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

}
