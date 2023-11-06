public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course oralMat;
    Course fizik;
    Course oralFizik;
    Course kimya;
    Course oralKimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course oralMat,
            Course fizik,Course oralFizik, Course kimya, Course oralKimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.oralMat= oralMat;
        this.fizik = fizik;
        this.oralFizik = oralFizik;
        this.kimya = kimya;
        this.oralKimya = oralKimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int sozluMat,
                                int fizik, int sozluFizik, int kimya, int sozluKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (sozluMat >= 0 && sozluMat <= 100) {
            this.oralMat.note = sozluMat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (sozluFizik >= 0 && sozluFizik <= 100) {
            this.oralFizik.note = sozluFizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (sozluKimya >= 0 && sozluKimya <= 100) {
            this.oralKimya.note = sozluKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.oralKimya.note*0.6)+(this.kimya.note*0.4))+
                ((this.oralFizik.note*0.6)+(this.fizik.note*0.4))+
                ((this.oralMat.note*0.6)+(this.mat.note*0.4))) / 3 ;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.oralMat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.oralFizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.oralKimya.note);
    }
}
