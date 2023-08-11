package practicum;

public class MyDate19 {
    int day;
    int month;
    int year;

    boolean format = true;

    public MyDate19(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        if (!format){
            return  year + "." + (month < 10 ? "0" : "") + month + "." + (day < 10 ? "0" : "") + day;
        }
        return (day < 10 ? "0" : "") + day + "." + (month < 10 ? "0" : "") + month + "." + year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFormat(boolean format) {
        this.format = format;
    }
}
