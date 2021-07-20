package AbstractPackage;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class AbstractDemo{

    String name;
    public void details() {
        System.out.println("I am abstract class.");
    }

    public String returnDay(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        return dayOfWeek.toString();
    }
}
