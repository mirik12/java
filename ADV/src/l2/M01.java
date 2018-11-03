package l2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class M01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        LocalDate dateM = LocalDate.now();
        System.out.println(dateM);
        LocalTime dateT = LocalTime.now();
        System.out.println(dateT);
        LocalDateTime dateDT = LocalDateTime.now();
        System.out.println(dateDT);
        
    }
}