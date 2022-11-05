package fpt.edu.bikeke.utils;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeUtils {
    public static Timestamp getCurrent() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Jakarta"));
        Timestamp timestamp = Timestamp.valueOf(zonedDateTime.toLocalDateTime());
        return timestamp;
    }

    public static Timestamp addTime(Timestamp timestamp, int durationMs){
        timestamp.setTime(timestamp.getTime() + durationMs);
        return timestamp;
    }
}
