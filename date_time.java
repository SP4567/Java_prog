import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
class date_time
{
public static void main(String args[])
{
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    DayOfWeek nOfWeek = DayOfWeek.from(now);
    System.out.println(dtf.format(now));
    System.out.println(DayOfWeek.from(nOfWeek));
}
}