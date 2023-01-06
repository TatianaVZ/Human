import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
                Human[] human = new Human[4];
        human[0] = new Human("Максим", "Минск", 35, "Бренд-менеджер" );
        human[1] = new Human("Аня", "Москва", 29, "методист образовательных программ");
        human[2] = new Human("Катя", "Калиненград", 28, "продакт-менеджер");
        human[3] = new Human("Артем", "Москва", 27, "директор по развитию бизнеса");
        for (Human i : human) {
            System.out.println(i);


        }

    }
    }
