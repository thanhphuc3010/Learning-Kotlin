package me.phucpt.lesson03;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return b * b - 4 * a * c;
    }

    public boolean isHasSolution() {
        return !(getDelta() < 0);
    }

    public double getFirstRoot() {
        double delta = getDelta();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getSecondRoot() {
        double delta = getDelta();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public void displayResult() {
        if (this.isHasSolution()) {
            double x1;
            if (getDelta() > 0) {
                x1 = getFirstRoot();
                double x2 = getSecondRoot();
                System.out.println("The Equation has two solutions: " + "\n x1 = " + x1 + "\n x2 = " + x2);
            } else {
                x1 = getFirstRoot();
                System.out.println("The Equation has one solution: x = " + x1);
            }
        } else {

            System.out.println("The Equation has no solution!");
        }
    }

}
