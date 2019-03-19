package Bodya;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asus on 26.02.2019.
 */
public class Utils {
    public static Date parseDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            return new Date();
        }
    }
}
