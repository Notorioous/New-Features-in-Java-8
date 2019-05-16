import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NewDateTimeApi {
    public static void main(String[] args) {

//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
//
//        LocalDate.of(2019, Month.MAY, 16);
//        LocalDate.of(2019, 1, 1);
//        LocalDate.ofYearDay(2019, 361);
//
//        LocalTime.of(10, 41, 55);
//        LocalTime.of(12, 10);
//        LocalTime.ofSecondOfDay(9_124);
//        LocalTime.ofNanoOfDay(100_000_000_000L);
//
//        //Поскольку LocalDateTime является объединением LocalDate и LocalTime, то и методы их схожи
//
//        System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
//
//        LocalDate now = LocalDate.now();
//        LocalDate _2017 = LocalDate.of(2017, 9, 10);
//        boolean after = now.isAfter(_2017);
//        boolean before = now.isBefore(_2017);
//        System.out.println(after);
//        System.out.println(before);
//
//        LocalDateTime now1 = LocalDateTime.now();
//        LocalDateTime monthAgo = now1.minusMonths(1);
//        boolean after1 = now1.isAfter(monthAgo);
//        boolean before1 = now1.isBefore(monthAgo);
//        System.out.println(after1);
//        System.out.println(before1);
//
//        //Во всех трёх классах при сравнении используется метод compareTo(), который можно вызвать и самостоятельно
//
//        LocalTime localTime = LocalTime.now();
//        LocalTime hourLater = localTime.plusHours(1);
//        boolean isTimeBefore = localTime.compareTo(hourLater)

        //Форматирование LocalDate

//        LocalDate now = LocalDate.now();
//        String basicIsoDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
//        String isoDate = now.format(DateTimeFormatter.ISO_DATE);
//        String isoWeakDate = now.format(DateTimeFormatter.ISO_WEEK_DATE);
//        String isoLocalDate = now.format(DateTimeFormatter.ISO_LOCAL_DATE);
//        String isoOrdinalDate = now.format(DateTimeFormatter.ISO_ORDINAL_DATE);

        //Если же нужного нам формата нет, всегда можно задать свой

//        LocalDate now = LocalDate.now();
//        String nat = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
//        System.out.println(nat);
//        String french = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy",Locale.FRANCE));
//        System.out.println(french);

        //Форматирование LocalTime

//        LocalTime now = LocalTime.now();
//        String isoLocalTime = now.format(DateTimeFormatter.ISO_LOCAL_TIME);
//        String isoTime = now.format(DateTimeFormatter.ISO_TIME);
//        System.out.println(isoLocalTime);
//        System.out.println(isoTime);
//
//        String nativeTime = now.format(DateTimeFormatter.ofPattern("hh:mm:ss "));
//        String engTime = now.format(DateTimeFormatter.ofPattern("hh:mm a"));
//        System.out.println(nativeTime);
//        System.out.println(engTime);

        //Базовая работа с  ZonedDateTime

//        ZonedDateTime now = ZonedDateTime.now();
//        LocalDate localDate = LocalDate.of(2018,1,1);
//        LocalTime localTime = LocalTime.of(10,30);
//        ZoneId zone = ZoneId.of("Europe/Kiev");
//        ZonedDateTime kievTime = ZonedDateTime.of(localDate,localTime,zone);
//        System.out.println(kievTime);
//        System.out.println(now);

       // Как получить все временные зоны

//        List<String> zones = new ArrayList<>(ZoneId.getAvailableZoneIds());
//        zones.forEach(System.out::println);

        //Period указывает временной промежуток между двумя датами.

//        LocalDate nextBirthDay = LocalDate.of(2018,9,23);
//        LocalDate now = LocalDate.now();
//
//        Period period = Period.between(nextBirthDay,now);
//        int days = period.getDays();
//
//        System.out.println(period);
//        System.out.println(days);

//
//        Period period = Period.of(1, 15, 60).normalized();
//        System.out.println(period);
//
//        int days = period.getDays();
//        System.out.println(days);

//        Period period = Period.of(1,15,60);
//        LocalDate localDate = LocalDate.of(2018, 1, 1);
//        LocalDate plus = localDate.plus(period);
//        System.out.println(plus);

        //Duration, по сути, исполняет ту же роль, что и Period но измеряет все в часах, минутах, секундах ...

        LocalTime _10AM = LocalTime.of(10, 10,15);
        LocalTime _9PM = LocalTime.of(21, 30);

        Duration duration = Duration.between(_10AM, _9PM);
        System.out.println(duration);





    }
}
