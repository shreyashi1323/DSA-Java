package API;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class DATETIME_NEW {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year = date.getYear();
        System.out.println(day +"/"+ month+"/"+ year);

        LocalTime time = LocalTime.now();
        System.out.println(time);
        int hour= time.getHour();
        int min = time.getMinute();
        int sec= time.getSecond();
        int nano=time.getNano();
        System.out.println(hour+":"+min+":"+sec+":"+nano);
    }
}