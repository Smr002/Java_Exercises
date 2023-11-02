package ex_9_5;

import java.util.GregorianCalendar;

public class test {

    public static void main(String[] args) {
       
        GregorianCalendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = currentCalendar.get(GregorianCalendar.MONTH) + 1;
        int currentDay = currentCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + currentMonth);
        System.out.println("Day: " + currentDay);


        GregorianCalendar specificTimeCalendar = new GregorianCalendar();
        long specificTimeInMillis = 1234567898765L;
        specificTimeCalendar.setTimeInMillis(specificTimeInMillis);

        int specificYear = specificTimeCalendar.get(GregorianCalendar.YEAR);
        int specificMonth = specificTimeCalendar.get(GregorianCalendar.MONTH) + 1;
        int specificDay = specificTimeCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nSpecific Date (elapsed time 1234567898765L):");
        System.out.println("Year: " + specificYear);
        System.out.println("Month: " + specificMonth);
        System.out.println("Day: " + specificDay);
    }
}
