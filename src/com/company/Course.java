package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double sozluNotu;
    double sozluNotEtkisi;

    Course(String name, String code, String prefix, int sozluNotEtkisi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.sozluNotEtkisi = (sozluNotEtkisi * 0.01);
        note = 0;
        sozluNotu = 0;

    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Geçerli öğretmenin branşı ders için uygun değil!!");

        }

    }

    public void printTeacher() {
        this.teacher.print();
    }
}
