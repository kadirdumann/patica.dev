public class Employee {
    String name ;
    double salary, tax=0, bonus, raise ;
    int workHours, hireYear, workYear ;


    public Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    //Maaşa uygulanan vergiyi hesaplayacaktır.
    public double tax() {

        if(salary < 1000){
            return tax;
        }else{
            tax=salary * 0.03;
            return tax;
        }

    }

    //Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
    // her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public double bonus(){
        if(workHours>40){
            bonus = (workHours-40)*30;
            return  bonus;
        }
        return 0;
    }

    // Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    public double raiseSalary(){
        workYear = 2021-hireYear;

        if(workYear<10){
            raise = salary * 0.05;
            return raise;
        } else if ((workYear>10)&&(workYear<20)) {
            raise = salary * 0.1;
            return raise;
        }else {
            raise = salary * 0.15;
            return raise;
        }
    }

    // Çalışana ait bilgileri ekrana bastıracaktır.
    public String toString(){
        System.out.println("İsmi : "+ name);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+ hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş Artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+(bonus()-tax()+salary));
        System.out.println("Toplam Maaş : "+(bonus()-tax()+raiseSalary()+salary));
        return null;
    }
}