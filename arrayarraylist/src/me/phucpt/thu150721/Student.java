package me.phucpt.thu150721;

import java.util.Comparator;

public class Student {
    private String id;
    private String name;
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student() {

    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "me.phucpt.thu150721.Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void sortStudentsByScore(Student[] studentArr) {
        Student temp = new Student();
        int countOfStudent = studentArr.length;
        for (int i = 0; i < countOfStudent - 1; i++) {
            for (int j = i + 1; j < countOfStudent; j++)
            if (studentArr[i].score < studentArr[j].score) {
                temp = studentArr[i];
                studentArr[i] = studentArr[j];
                studentArr[j] = temp;
            }
        }
    }


    static class sortByScore implements Comparator<Student> {
        public int compare(Student a, Student b)
        {
            return Double.compare(b.score, a.score);
//            if (a.score < b.score) return -1;
//            if (a.score > b.score) return 1;
//            return 0;

        }
    }


    public static void displayAllStudents(Student[] studentArr) {
        for (Student student:
             studentArr) {
            System.out.println(student);
        }
    }
}

