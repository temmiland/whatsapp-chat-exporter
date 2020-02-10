package wtf.tomxpcvx.wce.utils;

import java.util.Date;
import java.util.Calendar;

public class DateUtil {

    public static Date convertToUnixTime(double shiftedDate) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date((long) 978307200*1000));
        cal.add(Calendar.SECOND, (int) Math.round(shiftedDate));
        return cal.getTime();
    }
}
