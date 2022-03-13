package com.company;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(
            String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            course1.note = note1;
            course1.sozluNotu = sozlu1;
        } else {
            System.out.println("Not 1 için geçerli bir not girilmedi");
        }

        if (note2 >= 0 && note2 <= 100) {
            course2.note = note2;
            course2.sozluNotu = note2;
        } else {
            System.out.println("Not 2 için geçerli bir not girilmedi");
        }

        if (note3 >= 0 && note3 <= 100) {
            course3.note = note3;
            course3.sozluNotu = note3;
        } else {
            System.out.println("Not 3 için geçerli bir not girilmedi");
        }
    }

    void printNote() {
        System.out.println(this.course1.name + " Notu: " + (this.course1.note * (1 - this.course1.sozluNotEtkisi) + this.course1.sozluNotu * (this.course1.sozluNotEtkisi)));
        System.out.println(this.course2.name + " Notu: " + (this.course2.note * (1 - this.course2.sozluNotEtkisi) + this.course2.sozluNotu * (this.course1.sozluNotEtkisi)));
        System.out.println(this.course3.name + " Notu: " + (this.course3.note * (1 - this.course3.sozluNotEtkisi) + this.course3.sozluNotu * (this.course1.sozluNotEtkisi)));

    }

    void isPass() {
        this.avarage = ((this.course1.note + this.course1.sozluNotu) + (this.course2.note + this.course1.sozluNotu) + (this.course3.note + this.course1.sozluNotu)) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Geçtiniz...");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız");
            this.isPass = false;
        }
    }
}
