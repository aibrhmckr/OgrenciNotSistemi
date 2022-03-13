package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher Hacer =
                new Teacher(
                        "Hacer Halilbeyoğlu",
                        "KMY",
                        "05313313131");
        Teacher mehmet =
                new Teacher(
                        "Mehmet Yıldız",
                        "MAT",
                        "05316581774");
        Teacher yasemin =
                new Teacher("Yasemin Ocak", "BIO", "05456855555");

        Course kimya = new Course("Kimya", "101", "KMY", 30);
        kimya.addTeacher(Hacer);

        Course matematik = new Course("Matematik", "102", "MAT", 30);
        matematik.addTeacher(mehmet);

        Course Biyoloji = new Course("Biyoloji", "103", "BIO", 30);
        Biyoloji.addTeacher(yasemin);

        Student aslı = new Student("Aslı Aksu", "658", "12", kimya, Biyoloji, matematik);
        aslı.addBulkExamNote(100, 50, 50, 100, 100, 50);
        aslı.printNote();
        aslı.isPass();

    }


}
