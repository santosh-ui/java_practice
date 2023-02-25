/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter8;

/**
 *
 * @author Santosh
 */

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Chapter8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date(5000);
//        System.out.println(date.toString());
        
        // Now let's use the Calendar class to create a date using static getInstance() method
        Calendar now = Calendar.getInstance();
        
//        now.set(Calendar.MONTH, 5);
//        System.out.println(now.toString());
//        System.out.println(now.getFirstDayOfWeek());
//        System.out.println(now.getActualMinimum(Calendar.DAY_OF_WEEK));

        // getTime() method returns a Date Object
//        System.out.println(now.getTime());
//        date = now.getTime();
//        System.out.println(date.toString());

//        System.out.println(now.get(Calendar.MONTH));
//        
//        now.setTime(date);
//        System.out.println(now.toString());
        
        
        // Date Parsing and Formatting DateFormat
        // import java.text.DateFormat, java.text.SimpleDateFormat;
        Date dateOfCal;
        dateOfCal = now.getTime();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(date));
        
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df1.format(dateOfCal));
        
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df2.format(date));
        
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df3.format(dateOfCal));
        
        // parsing
        try {
            Date parDate = df3.parse("Monday, 19 February 2023");
            System.out.println(df3.isLenient());
            Date parDate1 = df.parse("20/02/2023");
            System.out.println(parDate1.toString());
        } catch (ParseException p) {
            System.out.println(p.toString());
        }
        
        
        // let's see SimpleDateFormat
        // first import the SimpleDateFormat from java.text
        SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd");
        try {
            Date today = sdf.parse("23/02/20");
            System.out.println(today.toString());
        } catch (ParseException p) {
            p.printStackTrace();
        }
    }
    
}
