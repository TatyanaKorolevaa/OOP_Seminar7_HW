
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company{

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private int maxSalary;
    private List<Vacansy> vacansies = new ArrayList<>();


   

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        setVacansies();

    }

    private void setVacansies() {
        for (int i = 0; i < 2; i++) {
            boolean is = true;
            int salary;
            if (i % 2 != 0) {
                is = true;
                salary = random.nextInt(2000, 10000);
            } else {
                salary = random.nextInt(10000, maxSalary);
            };
            vacansies.add(new Vacansy("Vacansy" + i, is, salary));
            System.out.printf("Компания: %s, заработная плата: %d,\n", name, salary);
        }
    }
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary);
    }


}
