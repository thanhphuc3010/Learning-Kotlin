package me.phucpt.lesson03;

public class BiQuadratic extends QuadraticEquation {
    public BiQuadratic(double a, double b, double c) {
        super(a, b, c);
        System.out.println("BiQuadratic Equation: " + a + "x^4 " + b + "x^2 " + c + "= 0");
    }

    public boolean isPositiveRoot(double root) {
        return root > 0;
    }

    private void printNoSolutionMessage() {
        System.out.println("The Equation has no solution!");
    }

    public void displayResult() {
        if (super.isHasSolution()) {
            if (getDelta() == 0) {
                if (isPositiveRoot(getFirstRoot())) {
                    double t1 = getFirstRoot();
                    System.out.println("The Equation has two solution: x1 = " + Math.sqrt(t1) + "; x2 = " + -Math.sqrt(t1));
                }
                else {
                    printNoSolutionMessage();
                }
            }
            else {
                double t1 = getFirstRoot();
                double t2 = getSecondRoot();
                if (t1 > 0 && t2 > 0) {
                    System.out.println("The Equation has four solutions: " + "\n x1 = " + Math.sqrt(t1) + "\n x2 = " + -Math.sqrt(t1) + "\n x3 = " + Math.sqrt(t2) + "\n x4 = " + -Math.sqrt(t2));
                }
                else if (t1 > 0 && t2 < 0) {
                    System.out.println("The Equation has two solutions: " + "\n x1 = " + Math.sqrt(t1) + "\n x2 = " + -Math.sqrt(t1));
                }
                else if (t1 < 0 && t2 > 0) {
                    System.out.println("The Equation has two solutions: " + "\n x1 = " + Math.sqrt(t2) + "\n x2 = " + -Math.sqrt(t2));
                }
                else {
                    printNoSolutionMessage();
                }
            }
        }
        else {
            printNoSolutionMessage();
        }
    }
}
