public class Vacansy {

    private String nameVacancy;

    private int Salary;

    public Vacansy(String nameVacancy, boolean isStudent, int salary) {
        this.nameVacancy = nameVacancy;
        Salary = salary;
    }

    public String getNameVacancy() {
        return nameVacancy;
    }

    public void setNameVacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

}
