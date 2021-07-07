package me.phucpt.lesson03;

public class Number {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Number() {

    }

    public Number(int value) {
        this.value = value;
    }

    public boolean isPrime() {
        if (value < 2) {
            return false;
        }
        else {
            for (int i = 2; i <= (value / 2); i++) {
                if (value % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printListPrime(int n) {
        for (int i = 0; i <= n; i++) {
            Number num = new Number(i);
            if(num.isPrime()) System.out.print(num.getValue() + " ");
        }
    }

    public int sumTotalDigit() {
        int sum = 0;
        while (value > 0) {
            int a = value % 10;
            setValue(value / 10);
            sum += a;
        }
        return sum;
    }

    public static int findGCD(Number x, Number y) {
        int temp;
        int a = x.value;
        int b = y.value;

        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int findLCM(Number x, Number y) {
        return (x.value * y.value) / findGCD(x, y);
    }

    public static int largestNumber(int x, int y, int z) {
        int largest;
        largest = (x > y) ? x : y;
        largest = (largest > z) ? largest : z;
        return largest;
    }

    public static int smallestNumber(int x, int y, int z) {
        int smallest;
        smallest = (x < y) ? x : y;
        smallest = (smallest < z) ? smallest : z;
        return smallest;
    }
}
