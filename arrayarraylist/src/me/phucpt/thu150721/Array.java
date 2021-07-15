package me.phucpt.thu150721;

import java.util.Arrays;

public class Array {
    public static int sum(int[] intNumber) {
        int sum = 0;
        for (int i = 0; i < intNumber.length; i = i + 2) {
            sum += intNumber[i];
        }
        return sum;
    }

    public static void sortDescending(int[] arr) {
        int length = arr.length;
        int temp;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j ++ ) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int equilibriumIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            int rightSum = 0;

            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return i;
        }
        return -1;
    }

    public static int equilibriumIndex1(int[] arr) {
        int prefixSum = 0;
        int leftSum = 0;
        for (int e : arr) {
            prefixSum += e;
        }

        for (int i = 0; i < arr.length; i++) {
            if (leftSum == prefixSum - leftSum - arr[i]) return i;
            leftSum += arr[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] ints = {1, 5, 6, 7, 10, 13, 20, 19};
        System.out.println(sum(ints));

        sortDescending(ints);

        for (int num :
                ints) {
            System.out.print(num + " ");
        }

        System.out.println();
        int[] arr = {1, 5, -3, 9, 3};
        System.out.println(equilibriumIndex(arr));
        System.out.println(equilibriumIndex1(ints));

        Student student1 = new Student("01", "Pham Phuc", 9.5);
        Student student2 = new Student("02", "Nguyen Hoan", 7.5);
        Student student3 = new Student("03", "Dang Lanh", 6.5);
        Student student4 = new Student("04", "Nguyen Chien", 8.5);
        Student student5 = new Student("05", "Bui Van", 9.75);

        Student[] studentArr = {student1, student2, student3, student4, student5};
        //me.phucpt.thu150721.Student.sortStudentsByScore(studentArr);
        Arrays.sort(studentArr, new Student.sortByScore());
        Student.displayAllStudents(studentArr);
    }
}
