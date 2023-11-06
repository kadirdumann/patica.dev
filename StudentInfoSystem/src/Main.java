public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course oralMat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course oralFizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course oralKimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015",
                mat, oralMat, fizik, oralFizik, kimya, oralKimya);
        s1.addBulkExamNote(50, 80, 20, 60,50, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133",
                mat, oralMat, fizik, oralFizik, kimya, oralKimya);
        s2.addBulkExamNote(100, 40, 50, 75, 40, 40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312",
                mat, oralMat, fizik, oralFizik, kimya, oralKimya);
        s3.addBulkExamNote(50, 50,20, 50,40, 65);
        s3.isPass();
    }
}