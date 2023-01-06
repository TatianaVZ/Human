import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Human {
    private int nowYear = LocalDate.now().getYear();
    private String nane;
    private String town;
    private int age;
    private String position;
    private int yearBirth;





    public Human (String nane, String town, int age, String position){
        this.nane = nane;
        this.town = town;
        this.age = age;
        this.position = position;
        this.yearBirth = nowYear - age;
    }


    public String getNane() {
        return nane;
    }

    public String getTown() {
        return town;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
            }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

        @Override
    public String toString() {
                return "Привет! Мення зовут " + nane + ". Я из города " + town + ". Я родился в " + yearBirth +
                " году. Моя профессия " + position + ".";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return nowYear == human.nowYear && age == human.age && yearBirth == human.yearBirth && Objects.equals(nane, human.nane) && Objects.equals(town, human.town) && Objects.equals(position, human.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nowYear, nane, town, age, position, yearBirth);
    }
}


