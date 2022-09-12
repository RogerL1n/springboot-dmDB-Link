package com.pck.dmdb.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @program: dmdb
 * @description: 时间工具类
 * @author: Pck
 * @create: 2022-08-23 16:46
 **/
public class DateUtil {

    public static String FORMAT_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static String FORMAT_YMDHMS2 = "yyyyMMddHHmmss";
    public static String FORMAT_YMDHM = "yyyy-MM-dd HH:mm";
    public static String FORMAT_YMDH = "yyyy-MM-dd HH";

    public static String FORMAT_YMDHMSS = "yyyy-MM-dd HH:mm:ss.S";

    public static String FORMAT_YM = "yyyy-MM";

    public static String FORMAT_YMD = "yyyy-MM-dd";
    public static String FORMAT_YMD2 = "yyyyMMdd";

    public static String FORMAT_MD = "MM-dd";

    public static String FORMAT_HMS = "HH:mm:ss";

    public static String FORMAT_HM = "HH:mm";

    /**
     * @param @param  date
     * @param @return
     * @return Calendar
     * @Title:getCalendar
     * @Description:获取calendar对象
     */
    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }

    /**
     * @param date
     * @param pattern
     * @return String
     * @Title:format
     * @Description:日期格式化为String
     */
    public static String format(Date date, String pattern) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(date);
    }

    /**
     * @param @param  date
     * @param @param  pattern
     * @param @throws ParseException
     * @return Date
     * @Title:pase
     * @Description:字符传转化日期格式
     */
    public static Date parse(String date, String pattern) {
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        if (date != null) {
            try {
                return df.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 延迟几分钟的日期
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date delayMinute(Date date, int minute) {
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.MINUTE, minute);
        return cal.getTime();
    }


    /**
     * @param @param  date 目标日期
     * @param @param  differDay 相差的天数
     * @param @return
     * @return Date
     * @Title:getDateByDifferDay
     * @Description:获得相差天数的日期
     */
    public static Date delayDay(Date date, int differDay) {
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.DAY_OF_YEAR, -differDay);
        return cal.getTime();
    }

    public static String dateConvert(Date date, int differDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cld = Calendar.getInstance();
        cld.setTime(date);
        cld.set(Calendar.DATE, cld.get(Calendar.DATE) - differDay);
        return sdf.format(cld.getTime());
    }

    /**
     * getDateByDifferMonth
     *
     * @param @param  date 目标日期
     * @param @param  differMonth 相差的月份
     * @param @return
     * @return Date
     * @Description:获得相差月份的日期
     */
    public static Date delayMonth(Date date, int differMonth) {
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.MONTH, differMonth);
        return cal.getTime();
    }

    /**
     * getDateByDifferMonth
     *
     * @param @param  date 目标日期
     * @param @param  differYear 相差的年份
     * @param @return
     * @return Date
     * @Description:获得相差年份的日期
     */
    public static Date delayYear(Date date, int differYear) {
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.YEAR, differYear);
        return cal.getTime();
    }

    /**
     * @param @param date
     * @return int
     * @Title:getYear
     * @Description:
     */
    public static int getYear(Date date) {
        Calendar cal = DateUtil.getCalendar(date);
        return cal.get(Calendar.YEAR);
    }

    /**
     * @param @param date
     * @return int
     * @Title:getMonth
     * @Description:
     */
    public static int getMonth(Date date) {
        Calendar calendar = DateUtil.getCalendar(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * @param @param date
     * @return int
     * @Title:getDay
     * @Description:
     */
    public static int getDay(Date date) {
        Calendar calendar = DateUtil.getCalendar(date);
        return calendar.get(Calendar.DAY_OF_MONTH) + 1;
    }

    /**
     * @param @param date
     * @return int
     * @Title:getHour
     * @Description:
     */
    public static int getHour(Date date) {
        Calendar calendar = DateUtil.getCalendar(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * @param @param date
     * @return int
     * @Title:getMinute
     * @Description:
     */
    public static int getMinute(Date date) {
        Calendar calendar = DateUtil.getCalendar(date);
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * @param @param date
     * @return int
     * @Title:getSecond
     * @Description:
     */
    public static int getSecond(Date date) {
        Calendar calendar = DateUtil.getCalendar(date);
        return calendar.get(Calendar.SECOND);
    }


    /**
     * @param @param  date1
     * @param @param  date2
     * @param @return
     * @return long
     * @Title:countDaysBetweenDates
     * @Description:获取两个日期间的天数
     */
    public static long countDaysBetweenDates(Date date1, Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        long between_days = (time2 - time1) / (1000 * 3600 * 24);
        return (between_days < 0) ? -between_days : between_days;
    }

    /**
     * 当天的开始时间
     *
     * @return
     */
    public static Date startOfTodDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = calendar.getTime();
        return date;
    }

    /**
     * 当天的结束时间
     *
     * @return
     */
    public static Date endOfTodDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        Date date = calendar.getTime();
        return date;
    }

    public static Date startOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    public static Date endOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONDAY), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        cal.set(Calendar.HOUR_OF_DAY, 24);
        return cal.getTime();
    }

    /**
     * 变化的小时
     *
     * @param offset
     * @return
     */
    public static String earlyHour(Integer offset) {
        Date date = new Date(System.currentTimeMillis() + (offset * 1000 * 60 * 60));
        return DateUtil.format(date, DateUtil.FORMAT_YMDHMS);
    }

    public static Date delayTime(int distanceDay, int hour) {
        Date date = new Date();
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.DAY_OF_YEAR, distanceDay);
        cal.add(Calendar.HOUR_OF_DAY, hour);
        return cal.getTime();
    }

    /**
     * 获取当前日期零点
     *
     * @return
     */
    public static Date getDayZero(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    /**
     * 取当前时间 格式为 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String getDateNow() {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        return myFormat.format(calendar.getTime());
    }

    public static String getDateNowS() {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMddHHmmssS");
        Calendar calendar = Calendar.getInstance();
        return myFormat.format(calendar.getTime());
    }

    /**
     * 取得当前时间戳（精确到秒）
     *
     * @return
     */
    public static String timeStamp() {
        long time = System.currentTimeMillis();
        String t = String.valueOf(time / 1000);
        return t;
    }

    /**
     * 时间戳转换成日期格式字符串
     *
     * @param seconds 精确到秒的字符串
     * @param format
     * @return
     */
    public static String timeStamp2Date(String seconds, String format) {
        if (seconds == null || seconds.isEmpty() || seconds.equals("null")) {
            return "";
        }
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds + "000")));
    }

    /**
     * 获取当前日期(yyyyMMdd)
     *
     * @return
     */
    public static String getDate() {
        return new SimpleDateFormat("yyyyMMdd").format(new Date());
    }

    /**
     * 获取当前日期时间(yyyyMMddHHmmss）
     *
     * @return
     */
    public static String getDateTime() {
        return new SimpleDateFormat(DateUtil.FORMAT_YMDHMS2).format(new Date());
    }

    public static String getNewDateTime() {
        return new SimpleDateFormat(DateUtil.FORMAT_YMDHMS).format(new Date());
    }

    public static String getNewDateM() {
        return new SimpleDateFormat(DateUtil.FORMAT_YM).format(new Date());
    }

    /**
     * 获取昨天的日期
     *
     * @param
     * @return 返回值类似于  2017-06-11
     * 2017年7月20日上午11:31:07
     * @author Zyb
     */
    public static String getLastDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(calendar.DATE, -1);
        date = calendar.getTime();

        String lastDate = sdf.format(date);
        return lastDate;
    }

    public static long minutesIsPoor(Date minuend, Date subtrahend) {
        long minuendN = minuend.getTime();
        long subtrahendN = subtrahend.getTime();
        long difference = (minuendN - subtrahendN) / (1000 * 60);
        return Math.abs(difference);
    }


    //获取前30天的时间
    public static String get30BeforeDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtil.FORMAT_YMDHMS);
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(calendar.DATE, -50);
        date = calendar.getTime();

        String lastDate = sdf.format(date);
        return lastDate;
    }

    //获取前5天的时间
    public static String get3BeforeDate() {
        SimpleDateFormat sdf = new SimpleDateFormat(DateUtil.FORMAT_YMDHMS);
        Calendar calendar = new GregorianCalendar();
        Date date = new Date();
        calendar.setTime(date);
        calendar.add(calendar.DATE, -3);
        date = calendar.getTime();

        String lastDate = sdf.format(date);
        return lastDate;
    }

    public static Date strToDate(String str, String formatStr) {
        SimpleDateFormat format = new SimpleDateFormat(formatStr);
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 日期字符串加 指定的天数
     *
     * @param dateStr   源日期字符串
     * @param format    日期格式
     * @param differDay 日期天数偏移量
     * @return 增加后的日期字符串
     */
    public static String getAddDayDate(String dateStr, String format, int differDay) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Calendar calendar = new GregorianCalendar();

        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        calendar.setTime(date);
        calendar.add(calendar.DATE, differDay);
        date = calendar.getTime();

        String lastDate = sdf.format(date);
        return lastDate;
    }

    /**
     * @param n    为推迟的周数 0本周，-1向前推迟一周，1下周，依次类推
     * @param week 获取星期数
     * @return
     */
    public static Date getLastOrNextWeekDate(String dateStr, int n, int week) {

        Date date = DateUtil.parse(dateStr, "yyyyMMdd");

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        //n为推迟的周数，0本周，-1向前推迟一周，1下周，依次类推
//        int n = 0;
        String monday;
        cal.add(Calendar.DATE, n * 7);
        //想周几，这里就传几Calendar.MONDAY（TUESDAY...） Calendar.SUNDAY（周天）
        cal.set(Calendar.DAY_OF_WEEK, week);
        return cal.getTime();
//        monday = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
//        System.out.println(monday);
//        return monday;
    }


    public static String delayDayS(Date date, int differDay) {
        Calendar cal = DateUtil.getCalendar(date);
        cal.add(Calendar.DAY_OF_YEAR, differDay);
        String monday = new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
        return monday;
    }

    /**
     * 根据日期获取当天是周几
     *
     * @param datetime 日期
     * @return 周几
     */
    public static String dateToWeek(String datetime) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        Date date;
        try {
            date = sdf.parse(datetime);
            cal.setTime(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        return weekDays[w];
    }


}
