package me.phucpt.lesson03;

public class Calculation {
    public static void main(String[] args) {
        QuadraticEquation qe1 = new QuadraticEquation(8, -6, 1);
        QuadraticEquation qe2 = new QuadraticEquation(1, -4, 4);
        QuadraticEquation qe3 = new QuadraticEquation(1, 10, 24);

        qe1.displayResult();
        qe2.displayResult();
        qe3.displayResult();

        Number x = new Number(87);

        System.out.println(x.isPrime());

        Number.printListPrime(10);

        System.out.println(x.sumTotalDigit());

        Number a = new Number(25);

        Number b = new Number(175);

        int GCD = Number.findGCD(a, b);

        System.out.println(GCD);

        System.out.println("Least Common Multiple of " + a.getValue() + " and " + b.getValue() + " is: " + Number.findLCM(a, b));

        System.out.println(Number.largestNumber(3, 4 ,5));

        System.out.println(Number.smallestNumber(7, 8, 9));

        BiQuadratic bq1 = new BiQuadratic(1, -8, 16);

        bq1.displayResult();

        Dog myDog = new Dog("Vani");

        System.out.println(myDog.getName());

        Level myLevel = Level.HIGH;

        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }

    }
}
