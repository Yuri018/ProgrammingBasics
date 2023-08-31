package ait.homeWork32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Comparator;

public class DateSortTest {
    Comparator<String> dateComparator;

    @BeforeEach
    void setUp() {
        //TODO
        dateComparator = (s1, s2) -> {

            String[] date1 = s1.split("-");
            String[] date2 = s2.split("-");

            int year1 = Integer.parseInt(date1[2]);
            int year2 = Integer.parseInt(date2[2]);

            int month1 = Integer.parseInt(date1[1]);
            int month2 = Integer.parseInt(date2[1]);

            int day1 = Integer.parseInt(date1[0]);
            int day2 = Integer.parseInt(date2[0]);

            if (year1 != year2) {
                return year1 - year2;
            }
            if (month1 != month2) {
                return month1 - month2;
            }
            return day1 - day2;
        };
    }

    @Test
    void testDateSort() {
        String[] dates = {
                "07-05-1990",
                "28-01-2010",
                "11-08-1990",
                "15-01-2010",
                "16-06-1970"
        };

        String[] expected = {
                "16-06-1970",
                "07-05-1990",
                "11-08-1990",
                "15-01-2010",
                "28-01-2010"
        };
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates, dateComparator);
        System.out.println(Arrays.toString(dates));
        assertArrayEquals(expected, dates);
    }
}
