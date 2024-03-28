import java.util.Random;

public class Engineer implements Observer{

    private String name;
    private int salary;

    public Engineer(String name){
        this.name = name;
        salary = 105000;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (this.salary <= salary){
            System.out.printf("Инженер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Инженер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }

}
