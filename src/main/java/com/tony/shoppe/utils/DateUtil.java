package com.tony.shoppe.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Tony on 2018/1/16.
 * com.tony.shoppe.utils.ShopAdministration
 * 描述：
 */
public class DateUtil {

    private static List<String> getMonthBetween(List<String> dateTime){
        List<String> dateList = new ArrayList<String>();
        if (dateTime.isEmpty()){
            return dateList;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        try {
            Date maxDate = simpleDateFormat.parse(dateTime.get(1));
            Date minDate = simpleDateFormat.parse(dateTime.get(0));
            if (minDate==maxDate){
                String format = simpleDateFormat.format(maxDate);
                dateList.add(format);
                return dateList;
            }
            Calendar max = Calendar.getInstance();
            max.setTime(maxDate);
            max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH),2);

            Calendar min = Calendar.getInstance();
            min.setTime(minDate);
            min.set(min.get(Calendar.YEAR),min.get(Calendar.MONTH),1);

            Calendar curr = min;

            while (min.before(max)){
                System.out.println(simpleDateFormat.format(min.getTime()));
                curr.add(Calendar.MONTH,1);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }

    private static List<String> getYearBetween(List<String> dateTime){
        List<String> dateList = new ArrayList<String>();
        if (dateTime.isEmpty()){
            return dateList;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        try {
            Date maxDate = simpleDateFormat.parse(dateTime.get(1));
            Date minDate = simpleDateFormat.parse(dateTime.get(0));
            if (minDate==maxDate){
                String format = simpleDateFormat.format(maxDate);
                dateList.add(format);
                return dateList;
            }
            Calendar max = Calendar.getInstance();
            max.setTime(maxDate);
            max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH),2);

            Calendar min = Calendar.getInstance();
            min.setTime(minDate);
            min.set(min.get(Calendar.YEAR), max.get(Calendar.MONTH),1);

            Calendar curr = min;

            while (min.before(max)){
                System.out.println(simpleDateFormat.format(min.getTime()));
                curr.add(Calendar.YEAR,1);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateList;
    }

    public static void main(String[] args) {
        List<String> da = new ArrayList<String>();
        da.add("2017-02-12");
        da.add("2019-02-12");
        getYearBetween(da);
    }

}
