package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    /** 현재날짜 가져오는 함수 **/
    public static String getNowStr() {
        LocalDateTime now = LocalDateTime.now();
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return formatedNow;
    }
}